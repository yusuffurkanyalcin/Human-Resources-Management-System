package com.example.demohrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "candidate_work_experiences")
public class CandidateWorkExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "candidate_id",referencedColumnName = "id")
    private Candidate candidate;

    @Column(name = "work_place")
    private String workPlace;

    @Column(name = "position")
    private String position;

    @Column(name = "beginning_date")
    private LocalDate beginningDate;

    @Column(name = "ending_date")
    private LocalDate endingDate;
}
