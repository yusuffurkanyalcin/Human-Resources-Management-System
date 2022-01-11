package com.example.demohrms.api.controllers;

import com.example.demohrms.business.abstracts.JobTitleService;
import com.example.demohrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/job-titles")
public class JobTitleController {

    private JobTitleService jobTitleService;


    @Autowired
    public JobTitleController(JobTitleService jobTitleService){
        this.jobTitleService=jobTitleService;

    }

    @GetMapping("/getall")
    public List<JobTitle> getAll(){
        return jobTitleService.getAll();
    }
}
