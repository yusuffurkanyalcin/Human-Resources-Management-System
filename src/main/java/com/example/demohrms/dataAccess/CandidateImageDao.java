package com.example.demohrms.dataAccess;

import com.example.demohrms.entities.concretes.CandidateImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CandidateImageDao extends JpaRepository<CandidateImage,Integer> {

    @Query("FROM CandidateImage  cI WHERE cI.candidateId=:candidateId")
    CandidateImage getByCandidateId(int candidateId);
}
