package com.example.demohrms.api.controllers;

import com.example.demohrms.business.abstracts.CandidateService;
import com.example.demohrms.core.results.Result;
import com.example.demohrms.entities.concretes.Candidate;
import com.example.demohrms.entities.dtos.CandidateRegisterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin
@RestController
@RequestMapping(value = "/candidate")
public class CandidateController {

    private CandidateService candidateService;

    @Autowired
    public CandidateController(CandidateService candidateService){
        this.candidateService=candidateService;
    }

    @PostMapping("/add")
    public Result add(@Valid @RequestBody CandidateRegisterDto candidateRegisterDto){
        return this.candidateService.signUp(candidateRegisterDto);
    }

    @GetMapping("/getall")
    public Result getAll(){
        return this.candidateService.getAll();
    }

}
