package com.example.demohrms.dataAccess;

import com.example.demohrms.entities.concretes.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProgrammingLanguageDao extends JpaRepository<ProgrammingLanguage,Integer> {


}
