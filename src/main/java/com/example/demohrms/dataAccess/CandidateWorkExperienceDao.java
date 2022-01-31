package com.example.demohrms.dataAccess;

import com.example.demohrms.entities.concretes.CandidateWorkExperience;
import com.example.demohrms.entities.dtos.CandidateWorkExperienceDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CandidateWorkExperienceDao extends JpaRepository<CandidateWorkExperience,Integer> {

    @Query("SELECT new com.example.demohrms.entities.dtos.CandidateWorkExperienceDto(cwe.workPlace,cwe.position,cwe.beginningDate,cwe.endingDate) FROM CandidateWorkExperience cwe WHERE cwe.candidate.id=:candidateId")
    List<CandidateWorkExperienceDto> getAllDtosByCandidateId(int candidateId);
}
