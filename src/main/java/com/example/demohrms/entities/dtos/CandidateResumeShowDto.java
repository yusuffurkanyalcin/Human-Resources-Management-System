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

    private CandidateShowDto candidateShowDto;
    private List<CandidateEducation> candidateEducations;

    private List<CandidateWorkExperience> candidateWorkExperienceList;

   private List<CandidateProgrammingLanguageDto> candidateProgrammingLanguageList;

   /* private List<CandidateLanguage> candidateLanguageList;

    private List<CandidateTechnology> candidateTechnologyList;

    private CandidateImage candidateImage;

    private CandidateWebsite candidateWebsite;

     */
}
