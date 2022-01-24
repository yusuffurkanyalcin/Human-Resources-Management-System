package com.example.demohrms.api.controllers;

import com.example.demohrms.business.abstracts.CandidateResumeService;
import com.example.demohrms.core.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resume")
public class CandidateResumeController {

    private CandidateResumeService candidateResumeService;

    @Autowired
    public CandidateResumeController(
            CandidateResumeService candidateResumeService
    ){
        this.candidateResumeService=candidateResumeService;
    }

    @GetMapping("/getbycandidateid/{candidateId}")
    public Result getByCandidateId(@PathVariable(name = "candidateId") int candidateId){
        return this.candidateResumeService.getResumeByCandidateId(candidateId);
    }
}
