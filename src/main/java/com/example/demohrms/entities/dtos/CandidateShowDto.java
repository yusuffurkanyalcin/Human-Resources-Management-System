package com.example.demohrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateShowDto {

    private int id;
    private String firstName;
    private String lastName;
}
