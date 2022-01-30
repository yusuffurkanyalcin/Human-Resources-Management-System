package com.example.demohrms.business.concretes;

import com.example.demohrms.business.abstracts.ProgrammingLanguageService;
import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.core.results.SuccessDataResult;
import com.example.demohrms.dataAccess.ProgrammingLanguageDao;
import com.example.demohrms.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageDao programmingLanguageDao;

    @Autowired
    public ProgrammingLanguageManager(
            ProgrammingLanguageDao programmingLanguageDao
    ){
        this.programmingLanguageDao=programmingLanguageDao;
    }
    @Override
    public DataResult<List<ProgrammingLanguage>> getAll() {
        return new SuccessDataResult<>(programmingLanguageDao.findAll());
    }

    @Override
    public DataResult<List<ProgrammingLanguage>> getAllByCandidateId(int candidateId) {
        return null;
    }
}
