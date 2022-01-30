package com.example.demohrms.business.abstracts;

import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.entities.concretes.Language;

import java.util.List;

public interface LanguageService {

    DataResult<List<Language>> getAll();
}
