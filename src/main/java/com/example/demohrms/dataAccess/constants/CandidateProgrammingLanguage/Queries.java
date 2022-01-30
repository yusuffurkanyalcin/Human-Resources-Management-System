package com.example.demohrms.dataAccess.constants.CandidateProgrammingLanguage;

import org.springframework.data.jpa.repository.Query;

public class Queries {

    public final static String GET_ALL_BY_CANDIDATE_ID=
            "SELECT new com.example.demohrms.entities.dtos.CandidateProgrammingLanguageDto("+
                "pl.name" +
                ") " +
                "FROM CandidateProgrammingLanguage cpl " +
                "INNER JOIN cpl.programmingLanguage pl " +
                "WHERE cpl.candidate.id=:candidateId";
}
