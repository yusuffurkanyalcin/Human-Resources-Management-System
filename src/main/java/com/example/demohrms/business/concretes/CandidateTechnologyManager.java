package com.example.demohrms.business.concretes;

import com.example.demohrms.business.abstracts.CandidateTechnologyService;
import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.core.results.SuccessDataResult;
import com.example.demohrms.dataAccess.CandidateTechnologyDao;
import com.example.demohrms.entities.dtos.CandidateTechnologyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateTechnologyManager implements CandidateTechnologyService {
    private CandidateTechnologyDao candidateTechnologyDao;

    @Autowired
    public CandidateTechnologyManager(
            CandidateTechnologyDao candidateTechnologyDao
    ){
        this.candidateTechnologyDao=candidateTechnologyDao;
    }
    @Override
    public DataResult<List<CandidateTechnologyDto>> getAllByCandidateId(int candidateId) {
        return new SuccessDataResult<>(candidateTechnologyDao.getAllByCandidateId(candidateId));
    }
}
