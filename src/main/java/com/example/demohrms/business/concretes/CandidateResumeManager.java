package com.example.demohrms.business.concretes;

import com.example.demohrms.business.abstracts.*;
import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.core.results.SuccessDataResult;
import com.example.demohrms.dataAccess.CandidateDao;
import com.example.demohrms.dataAccess.CandidateEducationDao;
import com.example.demohrms.entities.dtos.CandidateResumeShowDto;
import com.example.demohrms.entities.dtos.CandidateShowDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateResumeManager implements CandidateResumeService {
    private CandidateDao candidateDao;
    private CandidateEducationDao candidateEducationDao;
    private ModelMapper modelMapper;
    private CandidateProgrammingLanguageService candidateProgrammingLanguageService;
    private CandidateLanguageService candidateLanguageService;
    private CandidateTechnologyService candidateTechnologyService;
    private CandidateImageService candidateImageService;
    private CandidateWebsiteService candidateWebsiteService;
    private CandidateWorkExperienceService candidateWorkExperienceService;

    @Autowired
    public CandidateResumeManager(
            CandidateDao candidateDao,
            CandidateEducationDao candidateEducationDao,
            ModelMapper modelMapper,
            CandidateProgrammingLanguageService candidateProgrammingLanguageService,
            CandidateLanguageService candidateLanguageService,
            CandidateTechnologyService candidateTechnologyService,
            CandidateImageService candidateImageService,
            CandidateWebsiteService candidateWebsiteService,
            CandidateWorkExperienceService candidateWorkExperienceService
    ){
        this.candidateDao=candidateDao;
        this.candidateEducationDao=candidateEducationDao;
        this.modelMapper=modelMapper;
        this.candidateProgrammingLanguageService=candidateProgrammingLanguageService;
        this.candidateLanguageService=candidateLanguageService;
        this.candidateTechnologyService=candidateTechnologyService;
        this.candidateImageService=candidateImageService;
        this.candidateWebsiteService=candidateWebsiteService;
        this.candidateWorkExperienceService=candidateWorkExperienceService;
    }

    @Override
    public DataResult<CandidateResumeShowDto> getResumeByCandidateId(int candidateId) {

        CandidateResumeShowDto candidateResume = new CandidateResumeShowDto();

        CandidateShowDto candidateShowDto = modelMapper.map(this.candidateDao.findById(candidateId).get(),CandidateShowDto.class);
        candidateResume.setCandidate(candidateShowDto);

        candidateResume.setEducations(this.candidateEducationDao.findAllByCandidateId(candidateId));

        candidateResume.setWorkExperiences(candidateWorkExperienceService.getAllDtosByCandidateId(candidateId).getData());

        candidateResume.setProgrammingLanguages(candidateProgrammingLanguageService.getAllByCandidateId(candidateId).getData());

        candidateResume.setLanguages(candidateLanguageService.getAllByCandidateId(candidateId).getData());

        candidateResume.setTechnologies(candidateTechnologyService.getAllByCandidateId(candidateId).getData());

        candidateResume.setImage(candidateImageService.getDtoByCandidateId(candidateId).getData());

        candidateResume.setWebSites(candidateWebsiteService.getDtoByCandidateId(candidateId).getData());
        return new SuccessDataResult<>(candidateResume);
    }
}
