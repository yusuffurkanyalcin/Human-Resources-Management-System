package com.example.demohrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "candidate_educations")

public class CandidateEducation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "school_id",referencedColumnName = "id")
    @JsonIgnore
    private School school;

    @ManyToOne
    @JoinColumn(name = "department_id",referencedColumnName = "id")
    @JsonIgnore
    private Department department;

    @ManyToOne
    @JoinColumn(name = "candidate_id",referencedColumnName = "id")
    @JsonIgnore
    private Candidate candidate;

    @Column(name = "beginning_date")
    private LocalDate beginningDate;

    @Column(name = "ending_date")
    private LocalDate endingDate;


}
