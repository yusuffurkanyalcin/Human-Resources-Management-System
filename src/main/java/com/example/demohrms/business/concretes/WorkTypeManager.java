package com.example.demohrms.business.concretes;

import com.example.demohrms.business.abstracts.WorkTypeService;
import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.entities.concretes.WorkType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkTypeManager implements WorkTypeService {
    @Override
    public DataResult<List<WorkType>> getAll() {
        return null;
    }

    @Override
    public DataResult<WorkType> getById(int id) {
        return null;
    }
}
