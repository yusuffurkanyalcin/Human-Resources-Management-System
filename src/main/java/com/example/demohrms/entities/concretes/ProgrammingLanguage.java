package com.example.demohrms.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "programming_languages")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","candidateProgrammingLanguageList"})

public class ProgrammingLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "programmingLanguage")
    private List<CandidateProgrammingLanguage> candidateProgrammingLanguageList;
}
