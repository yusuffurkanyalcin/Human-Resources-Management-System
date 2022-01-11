package com.example.demohrms.entities.dtos;

import com.example.demohrms.entities.constants.ValidationMessages;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateRegisterDto extends RegisterDto{

    @NotBlank(message = ValidationMessages.PLEASE_FILL_IN_THE_FIRST_NAME)
    private String firstName;

    @NotBlank(message = ValidationMessages.PLEASE_FILL_IN_THE_LAST_NAME)
    private String lastName;

    @NotBlank(message = ValidationMessages.PLEASE_FILL_IN_THE_IDENTITY_NUMBER)
    private String identityNumber;

    @NotNull
    private int birthYear;
}
