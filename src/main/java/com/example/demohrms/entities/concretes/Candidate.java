package com.example.demohrms.entities.concretes;

import com.example.demohrms.entities.constants.ValidationMessages;
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


    @OneToOne(mappedBy = "candidate")
    private CandidateImage candidateImage;

    @OneToMany(mappedBy = "candidate")
    private List<CandidateEducation> candidateEducationList;

    @OneToMany(mappedBy = "candidate")
    private List<CandidateWorkExperience> candidateWorkExperienceList;

    @OneToMany(mappedBy = "candidate")
    private List<CandidateTechnology> candidateTechnologyList;

    @OneToMany(mappedBy = "candidate")
    private List<CandidateProgrammingLanguage> candidateProgrammingLanguageList;

    @OneToMany(mappedBy = "candidate")
    private List<CandidateLanguage> candidateLanguageList;


}
