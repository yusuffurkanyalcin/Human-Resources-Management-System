package com.example.demohrms.business.concretes;

import com.example.demohrms.business.abstracts.WorkTimeTypeService;
import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.entities.concretes.WorkTimeType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkTimeTypeManager implements WorkTimeTypeService {
    @Override
    public DataResult<List<WorkTimeType>> getAll() {
        return null;
    }

    @Override
    public DataResult<WorkTimeType> getById(int id) {
        return null;
    }
}
