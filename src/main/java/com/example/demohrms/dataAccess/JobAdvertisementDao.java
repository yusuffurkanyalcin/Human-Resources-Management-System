package com.example.demohrms.dataAccess;
import com.example.demohrms.dataAccess.constants.JobAdvertisement.Queries;
import com.example.demohrms.entities.concretes.JobAdvertisement;
import com.example.demohrms.entities.dtos.JobAdvertisementShowDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {

    @Query(Queries.IN_ACTIVE_JOB_ADVERTISEMENTS)
    List<JobAdvertisementShowDto> findAllInActives();

    @Query(Queries.ACTIVE_JOB_ADVERTISEMENTS)
    List<JobAdvertisementShowDto> findAllActives();

    @Query(Queries.GET_ALL_INACTIVES_BY_EMPLOYER_ID)
    List<JobAdvertisementShowDto> getAllInActivesByEmployerId(int employerId);

    @Query(Queries.GET_ALL_ACTIVES_BY_EMPLOYER_ID)
    List<JobAdvertisementShowDto> getAllActivesByEmployerId(int employerId);

}

