package com.example.demohrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateEducationDto {

    private String schoolName;
    private String departmentName;
    private LocalDate beginningDate;
    private LocalDate endingDate;
}
