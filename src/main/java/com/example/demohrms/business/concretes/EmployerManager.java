package com.example.demohrms.business.concretes;

import com.example.demohrms.business.abstracts.EmployerService;
import com.example.demohrms.business.abstracts.VerificationCodeEmployerService;
import com.example.demohrms.business.constants.Messages;
import com.example.demohrms.core.business.RunRules;
import com.example.demohrms.core.business.SingleModelMapper;
import com.example.demohrms.core.business.ValidateDto;
import com.example.demohrms.core.results.*;
import com.example.demohrms.dataAccess.EmployerDao;
import com.example.demohrms.entities.concretes.Employer;
import com.example.demohrms.entities.dtos.EmployerRegisterDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class EmployerManager implements EmployerService {

    private final EmployerDao employerDao;
    private final VerificationCodeEmployerService verificationCodeEmployerService;
    private ModelMapper modelMapper;
    @Autowired
    public EmployerManager(
            EmployerDao employerDao,
            VerificationCodeEmployerService verificationCodeEmployerService,
            ModelMapper modelMapper
    ){
        this.employerDao=employerDao;
        this.verificationCodeEmployerService=verificationCodeEmployerService;
        this.modelMapper=modelMapper;
    }

    @Override
    public Result addEmployerWithVerifyCode(String mailCode, String databaseCode) {
        return null;
    }

    @Override
    public Result signUp(EmployerRegisterDto employerRegisterDto) {

        Result result = RunRules.run(
                ValidateDto.validateProperties(employerRegisterDto),
                isEqualsPasswordAndConfirmPassword(employerRegisterDto.getPassword(),employerRegisterDto.getPasswordAgain())
        );

        if(result != null){
            return result;
        }

        Employer employer = modelMapper.map(employerRegisterDto,Employer.class);
        this.employerDao.save(employer);
        this.verificationCodeEmployerService.sendCode(employer.getEmail(),employer.getId());
        return new Result("oldu",true);
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<>(this.employerDao.findAll());
    }

    @Override
    public DataResult<Employer> getById(int id) {
        Employer employer = this.employerDao.findById(id).get();
        if( employer == null ){
            return new ErrorDataResult<>(null,Messages.NOT_EXISTS_ENTITY);
        }
        return new SuccessDataResult<>(employer);
    }

    private Result isEqualsPasswordAndConfirmPassword(String password, String confirmPassword) {
        if (password.trim().equals(confirmPassword.trim())) {
            return new SuccessResult();
        }
        return new ErrorResult(Messages.NOT_EQUALS_PASSWORDS);
    }


}
