package com.example.demohrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_advertisements")
public class JobAdvertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "employer_id",referencedColumnName = "id")
    private Employer employer;

    @Column(name = "job_id")
    private int jobId;

    @Column(name = "city_id")
    private int cityId;

    @Column(name = "work_type_id")
    private int workTypeId;

    @Column(name = "work_time_type_id")
    private int workTimeTypeId;

    @Column(name = "min_salary")
    private float minSalary;

    @Column(name = "max_salary")
    private float maxSalary;

    @Column(name = "position_description")
    private String positionDescription;

    @Column(name = "open_position")
    private int openPosition;

    @Column(name = "last_apply_date")
    private LocalDate lastApplyDate;

}
