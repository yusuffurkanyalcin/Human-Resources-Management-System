package com.example.demohrms.business.concretes;

import com.example.demohrms.business.abstracts.JobAdvertisementService;
import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.core.results.Result;
import com.example.demohrms.core.results.SuccessDataResult;
import com.example.demohrms.dataAccess.JobAdvertisementDao;
import com.example.demohrms.entities.concretes.JobAdvertisement;
import com.example.demohrms.entities.dtos.JobAdvertisementDto;
import com.example.demohrms.entities.dtos.JobAdvertisementShowDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

    private final JobAdvertisementDao jobAdvertisementDao;

    @Autowired
    public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao){
        this.jobAdvertisementDao=jobAdvertisementDao;
    }
    @Override
    public DataResult<List<JobAdvertisement>> getAll() {
        return null;
    }

    @Override
    public DataResult<JobAdvertisement> getById(int id) {
        return null;
    }

    @Override
    public Result add(JobAdvertisementDto jobAdvertisementDto) {
        return null;
    }

    @Override
    public DataResult<List<JobAdvertisementShowDto>> getAllActives() {
        return new SuccessDataResult<>(this.jobAdvertisementDao.findAllActives());
    }

    @Override
    public DataResult<List<JobAdvertisementShowDto>> getAllInActives() {
        return new SuccessDataResult<>(this.jobAdvertisementDao.findAllInActives());
    }

    @Override
    public DataResult<List<JobAdvertisementShowDto>> getAllActivesByEmployerId(int employerId) {

        return new SuccessDataResult<>(this.jobAdvertisementDao.getAllActivesByEmployerId(employerId));
    }

    @Override
    public DataResult<List<JobAdvertisementShowDto>> getAllInActivesByEmployerId(int employerId) {
        return new SuccessDataResult<>(this.jobAdvertisementDao.getAllInActivesByEmployerId(employerId));
    }


}
