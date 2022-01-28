package com.example.demohrms.business.abstracts;

import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.entities.concretes.CandidateWorkExperience;
import com.example.demohrms.entities.dtos.CandidateWorkExperienceDto;

import java.util.List;

public interface CandidateWorkExperienceService {

    DataResult<CandidateWorkExperienceDto> getById(int id);
    DataResult<CandidateWorkExperienceDto> getAllByCandidateId( int candidateId);
    DataResult<List<CandidateWorkExperienceDto>> getAll();
}
