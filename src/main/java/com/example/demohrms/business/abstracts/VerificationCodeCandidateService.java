package com.example.demohrms.business.abstracts;

import com.example.demohrms.core.business.BaseRepository;
import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.core.results.Result;
import com.example.demohrms.entities.concretes.VerificationCode;
import com.example.demohrms.entities.concretes.VerificationCodeCandidate;
import com.example.demohrms.entities.concretes.VerificationCodeEmployer;

import java.util.List;

public interface VerificationCodeCandidateService extends BaseRepository<VerificationCodeCandidate> {

    void sendCode(String toEmail  , int candidateId);

    Result updateToConfirm(int verificationCandidateId,String verificationCode );

    DataResult<VerificationCodeCandidate> add(VerificationCodeCandidate verificationCodeCandidate);
}
