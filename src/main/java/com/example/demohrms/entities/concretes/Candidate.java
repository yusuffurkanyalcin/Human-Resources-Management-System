package com.example.demohrms.entities.concretes;

import com.example.demohrms.entities.constants.ValidationMessages;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "candidates")
@PrimaryKeyJoinColumn(name = "id",referencedColumnName = "id")
public class Candidate extends User{

    @NotBlank(message = ValidationMessages.PLEASE_FILL_IN_THE_FIRST_NAME)
    @NotNull(message = ValidationMessages.PLEASE_FILL_IN_THE_FIRST_NAME)
    @Column(name = "first_name")
    private String firstName;


    @NotBlank(message = ValidationMessages.PLEASE_FILL_IN_THE_LAST_NAME)
    @NotNull(message = ValidationMessages.PLEASE_FILL_IN_THE_LAST_NAME)
    @Column(name = "last_name")
    private String lastName;

    @NotBlank(message = ValidationMessages.PLEASE_FILL_IN_THE_IDENTITY_NUMBER)
    @NotNull(message = ValidationMessages.PLEASE_FILL_IN_THE_IDENTITY_NUMBER)
    @Column(name = "identity_number")
    private String identityNumber;


    @NotNull(message = ValidationMessages.PLEASE_FILL_IN_THE_BIRTH_YEAR)
    @Column(name = "birth_year")
    private int birthYear;

    @JsonIgnore
    @OneToOne(mappedBy = "candidate")
    private CandidateWebsite candidateWebsite;

    @JsonIgnore
    @OneToMany(mappedBy = "candidate")
    private List<CandidateEducation> candidateEducationList;

    @JsonIgnore
    @OneToMany(mappedBy = "candidate")
    private List<CandidateWorkExperience> candidateWorkExperienceList;

    @JsonIgnore
    @OneToMany(mappedBy = "candidate")
    private List<CandidateTechnology> candidateTechnologyList;

    @JsonIgnore
    @OneToMany(mappedBy = "candidate")
    private List<CandidateProgrammingLanguage> candidateProgrammingLanguageList;

    @JsonIgnore
    @OneToMany(mappedBy = "candidate")
    private List<CandidateLanguage> candidateLanguageList;


}
