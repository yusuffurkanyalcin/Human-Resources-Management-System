package com.example.demohrms.entities.concretes;

import lombok.*;

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

    @ManyToOne
    @JoinColumn(name = "job_id",referencedColumnName = "id")
    private JobTitle jobTitle;

    @ManyToOne
    @JoinColumn(name = "city_id",referencedColumnName = "id")
    private City city;

    @ManyToOne
    @JoinColumn(name = "work_type_id",referencedColumnName = "id")
    private WorkType workType;

    @ManyToOne
    @JoinColumn(name = "work_time_type_id",referencedColumnName = "id")
    private WorkTimeType workTimeType;

    @Column(name = "min_salary")
    private double minSalary;

    @Column(name = "max_salary")
    private double maxSalary;

    @Column(name = "position_description")
    private String positionDescription;

    @Column(name = "open_position")
    private int openPosition;

    @Column(name = "last_apply_date")
    private LocalDate lastApplyDate;

    @Column(name = "is_active")
    private boolean status;

    @Column(name = "created_date")
    @Setter(value = AccessLevel.NONE)
    private LocalDate createdDate;



}
