package com.example.demohrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "verification_code_candidates")
@PrimaryKeyJoinColumn(name = "id",referencedColumnName = "id")
public class VerificationCodeCandidate extends VerificationCode{


    @Column(name = "candidate_id")
    private int candidateId;
}
