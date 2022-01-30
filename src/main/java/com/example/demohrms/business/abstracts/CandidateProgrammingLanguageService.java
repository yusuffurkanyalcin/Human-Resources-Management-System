package com.example.demohrms.business.abstracts;

import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.entities.concretes.CandidateProgrammingLanguage;
import com.example.demohrms.entities.dtos.CandidateProgrammingLanguageDto;

import java.util.List;

public interface CandidateProgrammingLanguageService {

    DataResult<List<CandidateProgrammingLanguageDto>> getAllByCandidateId(int candidateId);
}
