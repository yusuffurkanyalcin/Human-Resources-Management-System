package com.example.demohrms.entities.dtos;

import com.example.demohrms.entities.constants.ValidationMessages;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDto {

    @NotBlank(message = ValidationMessages.PLEASE_FILL_IN_THE_EMAIL)
    private String email;

    @Column(name = ValidationMessages.PLEASE_FILL_IN_THE_PASSWORD)
    private String password;

    @NotBlank(message = ValidationMessages.PLEASE_FILL_IN_THE_PASSWORD_AGAIN)
    private String passwordAgain;

}
