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
public class EmployerRegisterDto extends RegisterDto{

    @NotBlank(message = ValidationMessages.PLEASE_FILL_IN_THE_COMPANY_NAME)
    @NotNull(message = ValidationMessages.PLEASE_FILL_IN_THE_COMPANY_NAME)
    private String companyName;

    @NotBlank(message = ValidationMessages.PLEASE_FILL_IN_THE_WEB_ADDRESS)
    @NotNull(message = ValidationMessages.PLEASE_FILL_IN_THE_WEB_ADDRESS)
    private String webAddress;

    @NotBlank(message = ValidationMessages.PLEASE_FILL_IN_THE_PHONE_NUMBER)
    @NotNull(message = ValidationMessages.PLEASE_FILL_IN_THE_PHONE_NUMBER)
    private String phoneNumber;
}
