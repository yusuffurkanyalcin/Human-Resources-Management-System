package com.example.demohrms.business.abstracts;

import com.example.demohrms.core.business.BaseRepository;
import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.core.results.Result;
import com.example.demohrms.entities.concretes.Candidate;
import com.example.demohrms.entities.dtos.CandidateRegisterDto;

import java.util.List;

public interface CandidateService extends BaseRepository<Candidate> {

    Result signUp(CandidateRegisterDto candidateRegisterDto);
    Result addCandidateWithVerifyCode(String mailCode , String databaseCode);
}
