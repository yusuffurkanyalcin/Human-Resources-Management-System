package com.example.demohrms.business.concretes;

import com.example.demohrms.business.abstracts.JobTitleService;
import com.example.demohrms.dataAccess.JobTitleDao;
import com.example.demohrms.entities.concretes.JobTitle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleManager implements JobTitleService {

    private JobTitleDao jobTitleDao;

    public JobTitleManager(JobTitleDao jobTitleDao){
        this.jobTitleDao = jobTitleDao;
    }

    @Override
    public List<JobTitle> getAll() {
        return jobTitleDao.findAll();
    }
}
