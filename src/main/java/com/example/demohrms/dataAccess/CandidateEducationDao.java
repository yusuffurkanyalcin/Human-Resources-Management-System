package com.example.demohrms.dataAccess;

import com.example.demohrms.entities.concretes.CandidateEducation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CandidateEducationDao extends JpaRepository<CandidateEducation,Integer> {

    @Query("From CandidateEducation WHERE candidate.id=:candidateId")
    List<CandidateEducation> findAllByCandidateId(int candidateId);

}
