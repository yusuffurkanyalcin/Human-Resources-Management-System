package com.example.demohrms.api.controllers;

import com.example.demohrms.business.abstracts.ProgrammingLanguageService;
import com.example.demohrms.core.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/programming-language")
public class ProgrammingLanguageController {

    private ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public ProgrammingLanguageController(
            ProgrammingLanguageService programmingLanguageService
    ){
        this.programmingLanguageService=programmingLanguageService;
    }

    @GetMapping("/")
    public Result getAll(){
        return this.programmingLanguageService.getAll();
    }
}
