package com.example.demohrms.entities.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Local;

import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobAdvertisementShowDto {
    private int id;
    private String companyName;
    private String cityName;
    private String jobTitle;
    private String positionDescription;
    private int openPosition;
    private LocalDate createdDate;
    private LocalDate lasApplyDate;
    private String workType;
    private String workTimeType;
    private double minSalary;
    private double maxSalary;
}
