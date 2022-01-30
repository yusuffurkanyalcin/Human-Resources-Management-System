package com.example.demohrms.business.abstracts;

import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    DataResult<List<ProgrammingLanguage>> getAll();
    DataResult<List<ProgrammingLanguage>> getAllByCandidateId( int candidateId);
}
