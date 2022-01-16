package com.example.demohrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "candidate_resumes")
public class CandidateResume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToMany(mappedBy = "candidateResume")
    private List<CandidateEducation> candidateEducationList;

    @OneToOne(mappedBy = "candidateResume")
    @JoinColumn(name = "image_id",referencedColumnName = "id")
    private CandidateImage candidateImage;



}
