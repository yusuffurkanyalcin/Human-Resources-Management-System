package com.example.demohrms.business.concretes;

import com.example.demohrms.adapters.MailVerifyCodeAdapter;
import com.example.demohrms.business.abstracts.VerificationCodeCandidateService;
import com.example.demohrms.business.constants.Messages;
import com.example.demohrms.core.results.*;
import com.example.demohrms.dataAccess.VerificationCodeCandidateDao;
import com.example.demohrms.entities.concretes.VerificationCodeCandidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

@Service
public class VerificationCodeCandidateManager implements VerificationCodeCandidateService {

    private final VerificationCodeCandidateDao verificationCodeCandidateDao;
    private final MailVerifyCodeAdapter mailVerifyCodeAdapter;

    @Autowired
    public VerificationCodeCandidateManager(VerificationCodeCandidateDao verificationCodeCandidateDao,
                                            MailVerifyCodeAdapter mailVerifyCodeAdapter){
        this.verificationCodeCandidateDao=verificationCodeCandidateDao;
        this.mailVerifyCodeAdapter=mailVerifyCodeAdapter;
    }


    @Override
    public void sendCode(String toEmail, int candidateId) {
        VerificationCodeCandidate verificationCodeCandidate = new VerificationCodeCandidate();

        verificationCodeCandidate.setCode(generate_random_code());
        verificationCodeCandidate.setVerified(false);
        verificationCodeCandidate.setCandidateId(candidateId);
        VerificationCodeCandidate candidateCode = add(verificationCodeCandidate).getData();

        mailVerifyCodeAdapter.sendVerifyCodeToEmail(toEmail,
                generateEmailLink(String.valueOf(candidateCode.getId()),
                        verificationCodeCandidate.getCode(),String.valueOf(candidateId))
        );
    }


    @Override
    public DataResult<List<VerificationCodeCandidate>> getAll() {
        return new SuccessDataResult<>(this.verificationCodeCandidateDao.findAll());
    }

    @Override
    public DataResult<VerificationCodeCandidate> getById(int id) {
        VerificationCodeCandidate entity = verificationCodeCandidateDao.getById(id);
        if(entity != null)
            return new SuccessDataResult<>(entity);

        return new ErrorDataResult<>(null, Messages.NOT_EXISTS_ENTITY);
    }

    @Override
    public Result updateToConfirm(int id , String verificationCode ) {
        VerificationCodeCandidate updateCodeTable = this.verificationCodeCandidateDao.getById(id);

        if(updateCodeTable.getCode().equals(verificationCode)){

            updateCodeTable.setVerified(true);
            updateCodeTable.setVerifiedDate(LocalDate.now());
            verificationCodeCandidateDao.save(updateCodeTable);

            return new SuccessResult();
        }
        return new ErrorResult("Problem var");

    }

    @Override
    public DataResult<VerificationCodeCandidate> add(VerificationCodeCandidate verificationCodeCandidate) {
        return new SuccessDataResult<>(this.verificationCodeCandidateDao.save(verificationCodeCandidate));
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

    private String generateEmailLink(String id,String verificationCode,String candidateId){
        String link = "localhost:8080/verification-code-candidate/update-to-confirm?id="
                +id+"&verificationcode="
                +verificationCode;

        return link;
    }
}
