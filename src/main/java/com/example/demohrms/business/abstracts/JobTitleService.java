package com.example.demohrms.business.abstracts;

import com.example.demohrms.entities.concretes.JobTitle;

import java.util.List;

public interface JobTitleService {
    public List<JobTitle> getAll();
}
