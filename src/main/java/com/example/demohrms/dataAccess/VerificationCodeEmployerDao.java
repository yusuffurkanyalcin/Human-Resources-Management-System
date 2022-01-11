package com.example.demohrms.dataAccess;

import com.example.demohrms.entities.concretes.VerificationCodeEmployer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationCodeEmployerDao extends JpaRepository<VerificationCodeEmployer,Integer> {
}
