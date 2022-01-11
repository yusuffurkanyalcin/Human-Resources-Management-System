package com.example.demohrms.dataAccess;

import com.example.demohrms.entities.concretes.VerificationCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VerificationCodeDao extends JpaRepository<VerificationCode,Integer> {
}
