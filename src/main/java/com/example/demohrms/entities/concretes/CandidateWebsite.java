package com.example.demohrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "candidate_websites")
public class CandidateWebsite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "candidate_id",referencedColumnName = "id")
    private Candidate candidate;

    @Column(name = "github_address")
    private String githubAddress;

     @Column(name = "linkedin_address")
    private String linkedinAddress;
}
