package com.example.demohrms.dataAccess;

import com.example.demohrms.entities.concretes.CandidateWebsite;
import com.example.demohrms.entities.dtos.CandidateWebsiteDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CandidateWebsiteDao extends JpaRepository<CandidateWebsite,Integer> {

    @Query("SELECT new com.example.demohrms.entities.dtos.CandidateWebsiteDto(cw.githubAddress,cw.linkedinAddress) FROM CandidateWebsite cw WHERE cw.candidate.id=:candidateId")
    CandidateWebsiteDto getDtoByCandidateId(int candidateId);
}
