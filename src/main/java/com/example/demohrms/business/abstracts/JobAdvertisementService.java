package com.example.demohrms.business.abstracts;

import com.example.demohrms.core.business.BaseRepository;
import com.example.demohrms.core.results.Result;
import com.example.demohrms.entities.concretes.JobAdvertisement;
import com.example.demohrms.entities.dtos.JobAdvertisementDto;

public interface JobAdvertisementService extends BaseRepository<JobAdvertisement> {

    Result add(JobAdvertisementDto jobAdvertisementDto);
}
