package com.example.demohrms.api.controllers;

import com.example.demohrms.business.abstracts.CandidateWorkExperienceService;
import com.example.demohrms.business.concretes.CandidateWorkExperienceManager;
import com.example.demohrms.core.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/work-experience")
public class CandidateWorkExperienceController {

    private CandidateWorkExperienceService candidateWorkExperienceService;

    @Autowired
    public CandidateWorkExperienceController(
            CandidateWorkExperienceService candidateWorkExperienceService
    ){
        this
                .candidateWorkExperienceService=candidateWorkExperienceService;
    }

    @GetMapping("/getallbycandidateid/{candidateId}")
    public Result getById(@PathVariable("candidateId") int candidateId){
        return this.candidateWorkExperienceService.getAllDtosByCandidateId(candidateId);
    }

    @GetMapping("/getall")
    public Result getAll(){
        return this.candidateWorkExperienceService.getAll();
    }
}
