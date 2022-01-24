package com.example.demohrms.api.controllers;

import com.example.demohrms.business.abstracts.CandidateEducationService;
import com.example.demohrms.core.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate-education")
public class CandidateEducationController {

    private CandidateEducationService candidateEducationService;

    @Autowired
    public CandidateEducationController(CandidateEducationService candidateEducationService){
        this.candidateEducationService=candidateEducationService;
    }

    @GetMapping("/getallbycandidateid/{candidateId}")
    public Result getAllByCandidateId(@PathVariable(name = "candidateId") int candidateId){
        return this.candidateEducationService.getAllByCandidateId(candidateId);
    }
}
