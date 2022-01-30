package com.example.demohrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateProgrammingLanguageDto {

    private int id;
    private String candidateFirstName;
    private String candidateLastName;

    private String programmingLanguageName;
}
