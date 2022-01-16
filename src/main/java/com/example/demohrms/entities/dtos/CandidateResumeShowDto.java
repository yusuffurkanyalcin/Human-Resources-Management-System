package com.example.demohrms.entities.dtos;

import com.example.demohrms.entities.concretes.*;

import java.util.List;

public class CandidateResumeShowDto {

    private Candidate candidate;
    private List<CandidateWorkExperience> candidateWorkExperienceList;
    private List<CandidateEducation> candidateEducationList;
    private List<CandidateProgrammingLanguage> candidateProgrammingLanguageList;
    private List<CandidateLanguage> candidateLanguageList;
    private List<CandidateTechnology> candidateTechnologyList;
    private CandidateImage candidateImage;
    private CandidateWebsite candidateWebsite;
}
