package com.example.demohrms.dataAccess;


import com.example.demohrms.entities.concretes.WorkType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkTypeDao extends JpaRepository<WorkType,Integer> {
}
