package com.example.demohrms.dataAccess;

import com.example.demohrms.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployerDao extends JpaRepository<Employer,Integer> {

    /*@Query("From Employer where id=:employerId")
    Employer getById(int employerId);*/
}
