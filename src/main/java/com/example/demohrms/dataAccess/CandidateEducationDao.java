package com.example.demohrms.dataAccess;

import com.example.demohrms.dataAccess.constants.CandidateEducation.Queries;
import com.example.demohrms.entities.concretes.CandidateEducation;
import com.example.demohrms.entities.dtos.CandidateEducationDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CandidateEducationDao extends JpaRepository<CandidateEducation,Integer> {

    @Query(Queries.GET_ALL_BY_CANDIDATE_ID)
    List<CandidateEducationDto> findAllByCandidateId(int candidateId);

}
