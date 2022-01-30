package com.example.demohrms.api.controllers;

import com.example.demohrms.business.abstracts.CandidateProgrammingLanguageService;
import com.example.demohrms.core.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate-programming-languages")
public class CandidateProgrammingLanguageController {

    private CandidateProgrammingLanguageService candidateProgrammingLanguageService;

    @Autowired
    public CandidateProgrammingLanguageController(
            CandidateProgrammingLanguageService candidateProgrammingLanguageService
    ){
        this.candidateProgrammingLanguageService=candidateProgrammingLanguageService;
    }

    @GetMapping("/{candidateId}")
    public Result getAllByCandidateId(@PathVariable("candidateId") int candidateId){
        return this.candidateProgrammingLanguageService.getAllByCandidateId(candidateId);
    }
}
