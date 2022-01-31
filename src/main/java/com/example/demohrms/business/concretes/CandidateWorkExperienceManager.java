package com.example.demohrms.business.concretes;


import com.example.demohrms.business.abstracts.CandidateWorkExperienceService;
import com.example.demohrms.business.constants.Messages;
import com.example.demohrms.core.business.RunRules;
import com.example.demohrms.core.results.*;
import com.example.demohrms.dataAccess.CandidateWorkExperienceDao;
import com.example.demohrms.entities.concretes.CandidateWorkExperience;
import com.example.demohrms.entities.dtos.CandidateWorkExperienceDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
        this.modelMapper=modelMapper;
    }

    @Override
    public DataResult<CandidateWorkExperienceDto> getById(int id) {
        CandidateWorkExperience candidateWorkExperience = candidateWorkExperienceDao.getById(id);
       CandidateWorkExperienceDto dto = modelMapper.map(candidateWorkExperience,CandidateWorkExperienceDto.class);
        return new SuccessDataResult<>(dto);
    }

    @Override
    public DataResult<List<CandidateWorkExperienceDto>> getAllDtosByCandidateId(int candidateId) {

        return (isCandidateWorkExperienceExists(candidateId).isSuccess())
                ?new SuccessDataResult<>(candidateWorkExperienceDao.getAllDtosByCandidateId(candidateId))
                :new ErrorDataResult<>(null);
    }


    @Override
    public DataResult<List<CandidateWorkExperienceDto>> getAll() {

        return converToDtoList(candidateWorkExperienceDao.findAll());
    }

    private Result isCandidateWorkExperienceExists(int id){
        CandidateWorkExperience data = this.candidateWorkExperienceDao.getById(id);
        if(data == null){
            return new ErrorResult(Messages.NOT_EXISTS_ENTITY);
        }
        return new SuccessResult();
    }

    private DataResult<List<CandidateWorkExperienceDto>> converToDtoList(List<CandidateWorkExperience> list){
        List<CandidateWorkExperienceDto> dto;
        try {
            list = candidateWorkExperienceDao.findAll();
            dto = list.stream().map(
                    item -> modelMapper.map(item,CandidateWorkExperienceDto.class)
            ).collect(Collectors.toList());
        }catch (Exception e){
            return new ErrorDataResult<>(null,e.getMessage());
        }
        return new SuccessDataResult<>(dto);
    }
}

