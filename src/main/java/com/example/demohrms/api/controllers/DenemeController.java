package com.example.demohrms.api.controllers;

import com.example.demohrms.business.abstracts.CandidateWebsiteService;
import com.example.demohrms.core.results.Result;
import com.example.demohrms.dataAccess.CandidateWebsiteDao;
import com.example.demohrms.dataAccess.CandidateWorkExperienceDao;
import com.example.demohrms.entities.concretes.CandidateWebsite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/website")
public class DenemeController {

    private CandidateWebsiteDao candidateWebsiteDao;
    private CandidateWorkExperienceDao dao;

    @Autowired
    public DenemeController(
            CandidateWebsiteDao candidateWebsiteDao,
            CandidateWorkExperienceDao dao
    ){
        this.candidateWebsiteDao=candidateWebsiteDao;
        this.dao=dao;
    }

    @GetMapping("/")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(candidateWebsiteDao.findAll());
    }

    @GetMapping("/e")
    public ResponseEntity<?> all(){
        return  ResponseEntity.ok(dao.findAll());
    }
}
