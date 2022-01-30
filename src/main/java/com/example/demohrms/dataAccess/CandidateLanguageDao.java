package com.example.demohrms.dataAccess;

import com.example.demohrms.dataAccess.constants.CandidateLanguage.Queries;
import com.example.demohrms.entities.concretes.CandidateLanguage;
import com.example.demohrms.entities.dtos.CandidateLanguageDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CandidateLanguageDao extends JpaRepository<CandidateLanguage,Integer> {

   @Query(Queries.GET_ALL_BY_CANDIDATE_ID)
    List<CandidateLanguageDto> getAllByCandidateId(int candidateId);


}
