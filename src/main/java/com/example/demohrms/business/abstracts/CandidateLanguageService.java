package com.example.demohrms.business.abstracts;

import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.entities.dtos.CandidateLanguageDto;

import java.util.List;

public interface CandidateLanguageService {

    DataResult<List<CandidateLanguageDto>> getAllByCandidateId(int candidateId);

}
