package com.example.demohrms.business.concretes;

import com.example.demohrms.business.abstracts.LanguageService;
import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.core.results.SuccessDataResult;
import com.example.demohrms.dataAccess.LanguageDao;
import com.example.demohrms.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {
    private LanguageDao languageDao;
    @Autowired
    public LanguageManager(
            LanguageDao languageDao
    ){
        this.languageDao=languageDao;
    }
    @Override
    public DataResult<List<Language>> getAll() {
        return new SuccessDataResult<>(languageDao.findAll());
    }
}
