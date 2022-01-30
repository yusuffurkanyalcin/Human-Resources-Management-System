package com.example.demohrms.api.controllers;

import com.example.demohrms.business.abstracts.CandidateLanguageService;
import com.example.demohrms.core.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/candidate-language")
public class CandidateLanguageController {

    private CandidateLanguageService candidateLanguageService;

    @Autowired
    public  CandidateLanguageController(
            CandidateLanguageService candidateLanguageService
    ){
        this.candidateLanguageService=candidateLanguageService;
    }

    @GetMapping("/{candidateId}")
    public Result getAllByCandidateId(@PathVariable("candidateId") int candidateId){
        return candidateLanguageService.getAllByCandidateId(candidateId);
    }

}
