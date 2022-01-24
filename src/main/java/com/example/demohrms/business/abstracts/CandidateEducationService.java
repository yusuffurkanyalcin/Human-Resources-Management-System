package com.example.demohrms.business.abstracts;

import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.entities.concretes.CandidateEducation;

import java.util.List;

public interface CandidateEducationService {
    DataResult<List<CandidateEducation>> getAllByCandidateId(int candidateId);
}
