package com.example.demohrms.dataAccess;

import com.example.demohrms.entities.concretes.WorkTimeType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkTimeTypeDao extends JpaRepository<WorkTimeType,Integer> {
}
