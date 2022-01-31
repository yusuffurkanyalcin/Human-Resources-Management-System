package com.example.demohrms.dataAccess;

import com.example.demohrms.entities.concretes.CandidateTechnology;
import com.example.demohrms.entities.dtos.CandidateTechnologyDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CandidateTechnologyDao extends JpaRepository<CandidateTechnology,Integer> {

    @Query("SELECT new com.example.demohrms.entities.dtos.CandidateTechnologyDto(t.name) FROM CandidateTechnology ct INNER JOIN ct.technology t WHERE ct.candidate.id =:candidateId")
    List<CandidateTechnologyDto> getAllByCandidateId(int candidateId);
}
