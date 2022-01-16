package com.example.demohrms.business.abstracts;

import com.example.demohrms.core.business.BaseRepository;
import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.core.results.Result;
import com.example.demohrms.entities.concretes.Candidate;
import com.example.demohrms.entities.concretes.Employer;
import com.example.demohrms.entities.dtos.EmployerRegisterDto;

import java.util.List;

public interface EmployerService extends BaseRepository<Employer> {

    Result signUp(EmployerRegisterDto employerRegisterDto);

    Result addEmployerWithVerifyCode(String mailCode , String databaseCode);

    DataResult<Employer> getById(int employerId);

}
