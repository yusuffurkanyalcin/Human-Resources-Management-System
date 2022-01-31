package com.example.demohrms.dataAccess;

import com.example.demohrms.entities.concretes.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnologyDao extends JpaRepository<Technology,Integer> {
}
