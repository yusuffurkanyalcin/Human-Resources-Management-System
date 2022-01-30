package com.example.demohrms.business.concretes;

import com.example.demohrms.business.abstracts.CandidateProgrammingLanguageService;
import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.core.results.SuccessDataResult;
import com.example.demohrms.dataAccess.CandidateProgrammingLanguageDao;
import com.example.demohrms.entities.concretes.CandidateProgrammingLanguage;
import com.example.demohrms.entities.dtos.CandidateProgrammingLanguageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateProgrammingLanguageManager implements CandidateProgrammingLanguageService {

    private CandidateProgrammingLanguageDao candidateProgrammingLanguageDao;

    @Autowired
    public CandidateProgrammingLanguageManager(
            CandidateProgrammingLanguageDao candidateProgrammingLanguageDao
    ){
        this.candidateProgrammingLanguageDao=candidateProgrammingLanguageDao;
    }
    @Override
    public DataResult<List<CandidateProgrammingLanguageDto>> getAllByCandidateId(int candidateId) {
        return new SuccessDataResult<>(candidateProgrammingLanguageDao.getCandidateProgrammingLanguagesByCandidateId(candidateId));
    }
}
