package com.example.demohrms.business.abstracts;

import com.example.demohrms.core.business.BaseRepository;
import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.core.results.Result;
import com.example.demohrms.entities.concretes.JobAdvertisement;
import com.example.demohrms.entities.dtos.JobAdvertisementDto;
import com.example.demohrms.entities.dtos.JobAdvertisementShowDto;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobAdvertisementService extends BaseRepository<JobAdvertisement> {

    Result add(JobAdvertisementDto jobAdvertisementDto);

    DataResult<List<JobAdvertisementShowDto>> getAllActives();

    DataResult<List<JobAdvertisementShowDto>> getAllInActives();

    DataResult<List<JobAdvertisementShowDto>> getAllActivesByEmployerId(int employerId);

    DataResult<List<JobAdvertisementShowDto>> getAllInActivesByEmployerId(int employerId);
}
