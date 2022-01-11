package com.example.demohrms.business.concretes;

import com.example.demohrms.business.abstracts.JobAdvertisementService;
import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.entities.concretes.JobAdvertisement;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {
    @Override
    public DataResult<List<JobAdvertisement>> getAll() {
        return null;
    }

    @Override
    public DataResult<JobAdvertisement> getById(int id) {
        return null;
    }
}
