package com.example.demohrms.core.business;

import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.core.results.Result;

import java.util.List;

public interface BaseRepository<T>   {

    DataResult<List<T>> getAll();
    DataResult<T> getById(int id);

}
