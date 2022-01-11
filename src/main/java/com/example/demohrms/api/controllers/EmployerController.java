package com.example.demohrms.api.controllers;

import com.example.demohrms.business.abstracts.EmployerService;
import com.example.demohrms.core.results.Result;
import com.example.demohrms.entities.dtos.EmployerRegisterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


@RestController
@RequestMapping(value = "/employer")
public class EmployerController {

    private final EmployerService employerService;

    @Autowired
    public EmployerController(EmployerService employerService){
        this.employerService=employerService;
    }

    @PostMapping("/add")
    public Result  add(@Valid @RequestBody EmployerRegisterDto employerRegisterDto){
        return this.employerService.signUp(employerRegisterDto);
    }

    @GetMapping("/getall")
    public Result getAll(){
        return this.employerService.getAll();
    }
}
