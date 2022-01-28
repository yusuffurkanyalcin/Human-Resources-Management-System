package com.example.demohrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateWorkExperienceDto {

    private int id;

    private String candidateFirstName;
    private String candidateLastName;

    private String workPlace;
    private String position;

    private LocalDate beginningDate;
    private LocalDate endingDate;
}
