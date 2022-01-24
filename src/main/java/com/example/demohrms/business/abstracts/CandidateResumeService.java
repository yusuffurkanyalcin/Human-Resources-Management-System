package com.example.demohrms.business.abstracts;

import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.entities.dtos.CandidateResumeShowDto;

public interface CandidateResumeService {
    DataResult<CandidateResumeShowDto> getResumeByCandidateId(int candidateId);
}
