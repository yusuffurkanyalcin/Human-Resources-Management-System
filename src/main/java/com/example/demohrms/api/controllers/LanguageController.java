package com.example.demohrms.api.controllers;

import com.example.demohrms.business.abstracts.LanguageService;
import com.example.demohrms.core.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/language")
public class LanguageController {

    private LanguageService languageService;

    @Autowired
    public LanguageController(
            LanguageService languageService
    ){
        this.languageService=languageService;
    }

    @GetMapping("/")
    public Result getAll(){
        return languageService.getAll();
    }
}
