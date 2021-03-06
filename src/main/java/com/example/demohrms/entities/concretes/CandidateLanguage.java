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
@Table(name = "candidate_languages")
public class CandidateLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "candidate_id",referencedColumnName = "id")
    @JsonIgnore
    private Candidate candidate;

    @ManyToOne
    @JoinColumn(name = "language_id",referencedColumnName = "id")
    @JsonIgnore
    private Language language;

    @Column(name = "level")
    private char level;
}
