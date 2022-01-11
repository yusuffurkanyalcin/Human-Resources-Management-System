package com.example.demohrms.entities.dtos;

import com.example.demohrms.entities.concretes.Employer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobAdvertisementShowDto {

    private int id;
    private Employer employer;
}
