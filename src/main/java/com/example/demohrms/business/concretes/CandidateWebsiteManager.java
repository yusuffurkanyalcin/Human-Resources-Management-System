package com.example.demohrms.business.concretes;

import com.example.demohrms.business.abstracts.CandidateWebsiteService;
import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.core.results.SuccessDataResult;
import com.example.demohrms.dataAccess.CandidateWebsiteDao;
import com.example.demohrms.entities.dtos.CandidateWebsiteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateWebsiteManager implements CandidateWebsiteService {
    private CandidateWebsiteDao candidateWebsiteDao;

    @Autowired
    public CandidateWebsiteManager(
            CandidateWebsiteDao candidateWebsiteDao
    ){
        this.candidateWebsiteDao=candidateWebsiteDao;
    }

    @Override
    public DataResult<CandidateWebsiteDto> getDtoByCandidateId(int candidateId) {
        return new SuccessDataResult<>(candidateWebsiteDao.getDtoByCandidateId(candidateId));
    }
}
