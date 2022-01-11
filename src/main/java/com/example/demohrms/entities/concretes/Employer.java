package com.example.demohrms.entities.concretes;

import com.example.demohrms.entities.constants.ValidationMessages;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employers")
@PrimaryKeyJoinColumn(name = "id",referencedColumnName = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
public class Employer extends User{

    @NotBlank(message = ValidationMessages.PLEASE_FILL_IN_THE_COMPANY_NAME)
    @NotNull(message = ValidationMessages.PLEASE_FILL_IN_THE_COMPANY_NAME)
    @Column(name = "company_name")
    private String companyName;

    @NotBlank(message = ValidationMessages.PLEASE_FILL_IN_THE_WEB_ADDRESS)
    @NotNull(message = ValidationMessages.PLEASE_FILL_IN_THE_WEB_ADDRESS)
    @Column(name = "web_address")
    private String webAddress;

    @NotBlank(message = ValidationMessages.PLEASE_FILL_IN_THE_PHONE_NUMBER)
    @NotNull(message = ValidationMessages.PLEASE_FILL_IN_THE_PHONE_NUMBER)
    @Column(name = "phone_number")
    private String phoneNumber;
/*
    @OneToMany(mappedBy = "employer")
    private List<VerificationCodeEmployer> verificationCodeEmployers;

 */
    @OneToMany(mappedBy = "employer")
    private List<JobAdvertisement> jobAdvertisements;
}
