package com.example.demohrms.business.concretes;

import com.example.demohrms.business.abstracts.CandidateEducationService;
import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.core.results.SuccessDataResult;
import com.example.demohrms.dataAccess.CandidateEducationDao;
import com.example.demohrms.entities.concretes.CandidateEducation;
import com.example.demohrms.entities.dtos.CandidateEducationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateEducationManager implements CandidateEducationService {

    private CandidateEducationDao candidateEducationDao;

    @Autowired
    public CandidateEducationManager(
            CandidateEducationDao candidateEducationDao
    ){
        this.candidateEducationDao=candidateEducationDao;
    }

    @Override
    public DataResult<List<CandidateEducationDto>> getAllByCandidateId(int candidateId) {

        return new SuccessDataResult<>(this.candidateEducationDao.findAllByCandidateId(candidateId));
    }
}
