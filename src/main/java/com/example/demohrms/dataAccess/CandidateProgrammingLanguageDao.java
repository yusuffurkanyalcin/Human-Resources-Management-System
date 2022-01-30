package com.example.demohrms.dataAccess;

import com.example.demohrms.dataAccess.constants.CandidateProgrammingLanguage.Queries;
import com.example.demohrms.entities.concretes.CandidateProgrammingLanguage;
import com.example.demohrms.entities.dtos.CandidateProgrammingLanguageDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CandidateProgrammingLanguageDao extends JpaRepository<CandidateProgrammingLanguage,Integer> {

    @Query(Queries.GET_ALL_CANDIDATE_PROGRAMMING_LANGUAGES_BY_CANDIDATE_ID)
    List<CandidateProgrammingLanguageDto> getCandidateProgrammingLanguagesByCandidateId(int candidateId);
}
