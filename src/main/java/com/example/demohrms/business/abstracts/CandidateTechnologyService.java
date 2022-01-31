package com.example.demohrms.business.abstracts;

import com.example.demohrms.core.business.BaseRepository;
import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.entities.dtos.CandidateTechnologyDto;

import java.util.List;

public interface CandidateTechnologyService {
    DataResult<List<CandidateTechnologyDto>> getAllByCandidateId( int candidateId);
}
