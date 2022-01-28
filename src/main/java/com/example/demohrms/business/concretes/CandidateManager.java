package com.example.demohrms.business.concretes;

import com.example.demohrms.business.abstracts.CandidateService;
import com.example.demohrms.business.abstracts.VerificationCodeCandidateService;
import com.example.demohrms.business.constants.Messages;
import com.example.demohrms.core.business.RunRules;
import com.example.demohrms.core.business.SingleModelMapper;
import com.example.demohrms.core.business.ValidateDto;
import com.example.demohrms.core.results.*;
import com.example.demohrms.dataAccess.CandidateDao;
import com.example.demohrms.entities.concretes.Candidate;
import com.example.demohrms.entities.dtos.CandidateRegisterDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.MethodArgumentNotValidException;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.List;
import java.util.Set;

@Service
public class CandidateManager implements CandidateService {

    private final CandidateDao candidateDao;
    private final VerificationCodeCandidateService verificationCodeCandidateService;
    private ModelMapper modelMapper;


    @Autowired
    public CandidateManager(CandidateDao candidateDao,
                            VerificationCodeCandidateService verificationCodeCandidateService,
                            ModelMapper modelMapper){
        this.candidateDao=candidateDao;
        this.verificationCodeCandidateService=verificationCodeCandidateService;
        this.modelMapper=modelMapper;
    }

    @Override
    public Result signUp(CandidateRegisterDto candidateRegisterDto) {
        Result result = RunRules.run(
                isEqualsPasswordAndConfirmPassword(
                        candidateRegisterDto.getPassword(),
                        candidateRegisterDto.getPasswordAgain()
                ),
                ValidateDto.validateProperties(candidateRegisterDto)
        );

        if(result != null){
            return result;
        }


        Candidate newCandidate = modelMapper.map(candidateRegisterDto,Candidate.class);
        candidateDao.save(newCandidate);
        verificationCodeCandidateService.sendCode(candidateRegisterDto.getEmail(),newCandidate.getId());
        return new SuccessResult("Oldu");
    }

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<>(this.candidateDao.findAll());
    }

    @Override
    public DataResult<Candidate> getById(int id) {
        return null;
    }

    @Override
    public Result addCandidateWithVerifyCode(String mailCode , String databaseCode) {

        return null;
    }

    private Result isEqualsPasswordAndConfirmPassword(String password, String confirmPassword) {
        if (password.trim().equals(confirmPassword.trim())) {
            return new SuccessResult();
        }
        return new ErrorResult(Messages.NOT_EQUALS_PASSWORDS);
    }

}
