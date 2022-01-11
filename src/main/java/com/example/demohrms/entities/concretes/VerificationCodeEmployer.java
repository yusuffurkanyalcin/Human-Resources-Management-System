package com.example.demohrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "verification_code_employers")
@PrimaryKeyJoinColumn(name = "id",referencedColumnName = "id")
public class VerificationCodeEmployer extends VerificationCode{


    @Column(name = "employer_id")
    private int employerId;
}
