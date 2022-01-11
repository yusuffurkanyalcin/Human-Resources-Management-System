package com.example.demohrms.business.concretes;

import com.example.demohrms.adapters.MailVerifyCodeAdapter;
import com.example.demohrms.business.abstracts.VerificationCodeEmployerService;
import com.example.demohrms.business.constants.Messages;
import com.example.demohrms.core.results.*;
import com.example.demohrms.dataAccess.VerificationCodeEmployerDao;
import com.example.demohrms.entities.concretes.VerificationCodeEmployer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

@Service
public class VerificationCodeEmployerManager implements VerificationCodeEmployerService {

    private final VerificationCodeEmployerDao verificationCodeEmployerDao;
    private final MailVerifyCodeAdapter mailVerifyCodeAdapter;

    @Autowired
    public VerificationCodeEmployerManager(VerificationCodeEmployerDao verificationCodeEmployerDao,
                                           MailVerifyCodeAdapter mailVerifyCodeAdapter){
        this.verificationCodeEmployerDao=verificationCodeEmployerDao;
        this.mailVerifyCodeAdapter=mailVerifyCodeAdapter;
    }
    @Override
    public DataResult<List<VerificationCodeEmployer>> getAll() {
        return new SuccessDataResult<>(verificationCodeEmployerDao.findAll());
    }

    @Override
    public DataResult<VerificationCodeEmployer> getById(int id) {
        VerificationCodeEmployer entity = verificationCodeEmployerDao.getById(id);
        if( entity != null){
            return new SuccessDataResult<>(entity);
        }
        return new ErrorDataResult<>(null, Messages.NOT_EXISTS_ENTITY);
    }

    @Override
    public void sendCode(String toEmail, int employerId) {

        VerificationCodeEmployer verificationCodeEmployer = new VerificationCodeEmployer();

        verificationCodeEmployer.setCode(generate_random_code());
        verificationCodeEmployer.setEmployerId(employerId);
        verificationCodeEmployer.setVerified(false);

        VerificationCodeEmployer created = add(verificationCodeEmployer).getData();

        mailVerifyCodeAdapter.sendVerifyCodeToEmail(toEmail,
                generateEmailLink(String.valueOf(created.getId()),
                        verificationCodeEmployer.getCode(),
                        String.valueOf(employerId)));

    }

    @Override
    public Result updateToConfirm(int verificationEmployerId, String verificationCode) {
        VerificationCodeEmployer updateCodeTable = this.verificationCodeEmployerDao.getById(verificationEmployerId);

        if(updateCodeTable.getCode().equals(verificationCode)){

            updateCodeTable.setVerified(true);
            updateCodeTable.setVerifiedDate(LocalDate.now());
            verificationCodeEmployerDao.save(updateCodeTable);

            return new SuccessResult();
        }
        return new ErrorResult("Problem var");
    }

    @Override
    public DataResult<VerificationCodeEmployer> add(VerificationCodeEmployer verificationCodeEmployer) {
        return new SuccessDataResult<>(this.verificationCodeEmployerDao.save(verificationCodeEmployer));
    }

    private String generate_random_code(){
        int leftLimit = 48;
        int rightLimit = 122;
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString;
    }

    private String generateEmailLink(String id,String verificationCode,String employerId){
        String link = "localhost:8080/verification-code-employer/update-to-confirm?id="
                +id+"&verificationcode="
                +verificationCode;

        return link;
    }
}
