package com.example.demohrms.business.abstracts;

import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.entities.dtos.CandidateWebsiteDto;

public interface CandidateWebsiteService {

    DataResult<CandidateWebsiteDto> getDtoByCandidateId(int candidateId);
}
