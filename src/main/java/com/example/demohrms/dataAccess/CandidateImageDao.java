package com.example.demohrms.dataAccess;

import com.example.demohrms.entities.concretes.CandidateImage;
import com.example.demohrms.entities.dtos.CandidateImageDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CandidateImageDao extends JpaRepository<CandidateImage,Integer> {

    @Query("FROM CandidateImage  cI WHERE cI.candidateId=:candidateId")
    CandidateImage getByCandidateId(int candidateId);


    @Query("SELECT new com.example.demohrms.entities.dtos.CandidateImageDto(cI.url,cI.name) FROM CandidateImage cI WHERE cI.candidateId=:candidateId")
    CandidateImageDto getDtoByCandidateId(int candidateId);
}
