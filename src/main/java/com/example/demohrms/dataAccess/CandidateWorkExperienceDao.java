package com.example.demohrms.dataAccess;

import com.example.demohrms.entities.concretes.CandidateWorkExperience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CandidateWorkExperienceDao extends JpaRepository<CandidateWorkExperience,Integer> {

    @Query("FROM CandidateWorkExperience WHERE candidate.id = :candidateId")
    List<CandidateWorkExperience> getAllByCandidateId(int candidateId);
}
