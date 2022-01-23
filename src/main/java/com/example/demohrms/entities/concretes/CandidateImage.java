package com.example.demohrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "candidate_images")
public class CandidateImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "candidate_id",referencedColumnName = "id")
    private Candidate candidate;

    @Column(name = "url")
    private String url;

    @Column(name = "name")
    private String name;

    @Column(name = "image_id")
    private String imageId;

    public CandidateImage(int candidateId,String url ,String name , String imageId){
        this.candidate.setId(candidateId);
        this.name=name;
        this.url=url;
        this.imageId=imageId;
    }
}
