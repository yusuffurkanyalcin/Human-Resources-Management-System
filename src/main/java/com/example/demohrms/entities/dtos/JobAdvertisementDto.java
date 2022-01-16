package com.example.demohrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobAdvertisementDto {
    private int id;
    private int employerId;
    private int jobId;
    private int cityId;
    private int workTypeId;
    private int workTimeTypeId;
    private double minSalary;
    private double maxSalary;
    private String positionDescription;
    private int openPosition;
    private LocalDate lastApplyDate;
}
