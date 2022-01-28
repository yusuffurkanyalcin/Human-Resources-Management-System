package com.example.demohrms.dataAccess;

import com.example.demohrms.entities.concretes.CandidateWorkExperience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateWorkExperienceDao extends JpaRepository<CandidateWorkExperience,Integer> {
}
