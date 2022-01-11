package com.example.demohrms.dataAccess;

import com.example.demohrms.entities.concretes.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {
}
