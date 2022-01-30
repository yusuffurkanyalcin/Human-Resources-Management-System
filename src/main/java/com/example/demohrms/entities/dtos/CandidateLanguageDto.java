package com.example.demohrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateLanguageDto {

    private String languageName;
    private char languageLevel;
}
