package com.example.demohrms.business.abstracts;

import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.entities.concretes.CandidateEducation;
import com.example.demohrms.entities.dtos.CandidateEducationDto;

import java.util.List;

public interface CandidateEducationService {
    DataResult<List<CandidateEducationDto>> getAllByCandidateId(int candidateId);
}
