package com.example.demohrms.business.concretes;

import com.example.demohrms.business.abstracts.CandidateLanguageService;
import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.core.results.SuccessDataResult;
import com.example.demohrms.dataAccess.CandidateLanguageDao;
import com.example.demohrms.entities.dtos.CandidateLanguageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateLanguageManager implements CandidateLanguageService {
    private CandidateLanguageDao candidateLanguageDao;

    @Autowired
    public CandidateLanguageManager(
            CandidateLanguageDao candidateLanguageDao
    ){
        this.candidateLanguageDao=candidateLanguageDao;
    }
    @Override
    public DataResult<List<CandidateLanguageDto>> getAllByCandidateId(int candidateId) {
        return new SuccessDataResult<>(candidateLanguageDao.getAllByCandidateId(candidateId));
    }


}
