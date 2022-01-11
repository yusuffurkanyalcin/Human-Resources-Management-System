package com.example.demohrms.api.controllers;

import com.example.demohrms.business.abstracts.VerificationCodeCandidateService;
import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.core.results.Result;
import com.example.demohrms.entities.concretes.VerificationCodeCandidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/verification-code-candidate")
public class VerificationCodeCandidateController {

    private final VerificationCodeCandidateService verificationCodeCandidateService;

    @Autowired
    public VerificationCodeCandidateController(VerificationCodeCandidateService verificationCodeCandidateService){
        this.verificationCodeCandidateService=verificationCodeCandidateService;
    }

    @GetMapping("/getall")
    public DataResult<List<VerificationCodeCandidate>> getAll(){
        return this.verificationCodeCandidateService.getAll();
    }

    @GetMapping("/update-to-confirm")
    public Result updateToConfirm(@RequestParam(name = "id") String id , @RequestParam(name = "verificationcode") String verificationcode){
        return this.verificationCodeCandidateService.updateToConfirm(Integer.valueOf(id),verificationcode);
    }
}
