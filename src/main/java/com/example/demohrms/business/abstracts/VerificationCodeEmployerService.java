package com.example.demohrms.business.abstracts;

import com.example.demohrms.core.business.BaseRepository;
import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.core.results.Result;
import com.example.demohrms.entities.concretes.VerificationCodeEmployer;

public interface VerificationCodeEmployerService extends BaseRepository<VerificationCodeEmployer> {

    void sendCode(String toEmail  , int employerId);

    Result updateToConfirm(int verificationEmployerId, String verificationCode );

    DataResult<VerificationCodeEmployer> add(VerificationCodeEmployer verificationCodeEmployer);
}
