package com.example.demohrms.api.controllers;

import com.example.demohrms.business.abstracts.JobAdvertisementService;
import com.example.demohrms.core.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/job-advertisement")
public class JobAdvertisementController {

    private final JobAdvertisementService jobAdvertisementService;

    @Autowired
    public JobAdvertisementController(JobAdvertisementService jobAdvertisementService){
        this.jobAdvertisementService=jobAdvertisementService;
    }

    @GetMapping("/getallactives")
    public Result getAll(){
        return this.jobAdvertisementService.getAllActives();
    }

    @GetMapping("/getallinactives")
    public Result getAllInActives(){
        return this.jobAdvertisementService.getAllInActives();
    }

    @GetMapping("/getallactivesbyemployerid")
    public Result getAllActivesByEmployerId(@RequestParam int employerId){
        return this.jobAdvertisementService.getAllActivesByEmployerId(employerId);
    }
    @GetMapping("/getallinactivesbyemployerid")
    public Result getAllInActivesByEmployerId(@RequestParam int employerId){
        return this.jobAdvertisementService.getAllInActivesByEmployerId(employerId);
    }


}
