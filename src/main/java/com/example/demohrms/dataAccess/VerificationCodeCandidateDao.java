package com.example.demohrms.dataAccess;

import com.example.demohrms.entities.concretes.VerificationCodeCandidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationCodeCandidateDao extends JpaRepository<VerificationCodeCandidate,Integer> {
}
