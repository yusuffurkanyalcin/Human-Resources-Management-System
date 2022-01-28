package com.example.demohrms.business.concretes;


import com.example.demohrms.business.abstracts.CandidateWorkExperienceService;
import com.example.demohrms.business.constants.Messages;
import com.example.demohrms.core.business.RunRules;
import com.example.demohrms.core.business.SingleModelMapper;
import com.example.demohrms.core.results.*;
import com.example.demohrms.dataAccess.CandidateWorkExperienceDao;
import com.example.demohrms.entities.concretes.CandidateWorkExperience;
import com.example.demohrms.entities.dtos.CandidateWorkExperienceDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateWorkExperienceManager implements CandidateWorkExperienceService {
    private CandidateWorkExperienceDao candidateWorkExperienceDao;
    private ModelMapper modelMapper;

    @Autowired
    public CandidateWorkExperienceManager(
            CandidateWorkExperienceDao candidateWorkExperienceDao,
            ModelMapper modelMapper
    ){
        this.candidateWorkExperienceDao=candidateWorkExperienceDao;
    }

    @Override
    public DataResult<CandidateWorkExperienceDto> getById(int id) {
        Result result = RunRules.run(isCandidateWorkExperienceExists(id));
        if(result != null){
            return new ErrorDataResult<>(null, result.getMessage());
        }
        CandidateWorkExperience candidateWorkExperience = this.candidateWorkExperienceDao.getById(id);
        CandidateWorkExperienceDto dto= SingleModelMapper.getInstance().map(candidateWorkExperience,CandidateWorkExperienceDto.class);
        return new SuccessDataResult<>(dto);
    }

    @Override
    public DataResult<CandidateWorkExperienceDto> getAllByCandidateId(int candidateId) {
        return null;
    }

    @Override
    public DataResult<List<CandidateWorkExperienceDto>> getAll() {

        List<CandidateWorkExperienceDto> dto = modelMapper.map(candidateWorkExperienceDao.findAll(),new TypeToken<List<CandidateWorkExperienceDto>>(){}.getType());
        return new SuccessDataResult<>(dto);
    }

    private Result isCandidateWorkExperienceExists(int id){
        CandidateWorkExperience data = this.candidateWorkExperienceDao.getById(id);
        if(data == null){
            return new ErrorResult(Messages.NOT_EXISTS_ENTITY);
        }
        return new SuccessResult();
    }
}

