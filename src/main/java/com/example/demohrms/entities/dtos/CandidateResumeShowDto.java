package com.example.demohrms.entities.dtos;

import com.example.demohrms.entities.concretes.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateResumeShowDto{

    private CandidateShowDto candidate;

    private List<CandidateEducationDto> educations;

    private List<CandidateWorkExperience> workExperiences;

   private List<CandidateProgrammingLanguageDto> programmingLanguages;

    private List<CandidateLanguageDto> languages;

    /* private List<CandidateTechnology> candidateTechnologyList;

    private CandidateImage candidateImage;

    private CandidateWebsite candidateWebsite;

     */
}
