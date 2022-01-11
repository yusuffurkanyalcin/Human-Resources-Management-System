package com.example.demohrms.core.business;

import com.example.demohrms.core.results.ErrorResult;
import com.example.demohrms.core.results.Result;
import com.example.demohrms.core.results.SuccessResult;
import com.example.demohrms.entities.dtos.EmployerRegisterDto;
import com.example.demohrms.entities.dtos.RegisterDto;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class ValidateDto {
    public static Result validateProperties(RegisterDto registerDto){
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<RegisterDto>> violations=validator.validate(registerDto);

        for(ConstraintViolation<RegisterDto> violation : violations){
            if(!violation.getMessage().isBlank()){
                return new ErrorResult(violation.getMessage());
            }

        }
        return new SuccessResult();
    }
}
