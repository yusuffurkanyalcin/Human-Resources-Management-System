package com.example.demohrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "candidate_programming_languages")
public class CandidateProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "candidate_id",referencedColumnName = "id")
    @JsonIgnore
    private Candidate candidate;

    @ManyToOne
    @JoinColumn(name = "programming_language_id",referencedColumnName = "id")
    @JsonIgnore
    private ProgrammingLanguage programmingLanguage;
}
