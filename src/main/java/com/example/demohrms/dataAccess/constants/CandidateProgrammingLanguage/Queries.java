package com.example.demohrms.dataAccess.constants.CandidateProgrammingLanguage;

import org.springframework.data.jpa.repository.Query;

public class Queries {

    public final static String GET_ALL_CANDIDATE_PROGRAMMING_LANGUAGES_BY_CANDIDATE_ID=
            "SELECT new com.example.demohrms.entities.dtos.CandidateProgrammingLanguageDto(" +
                "cpl.id," +
                "c.firstName," +
                "c.lastName," +
                "pl.name" +
                ") " +
                "FROM CandidateProgrammingLanguage cpl " +
                "INNER JOIN cpl.candidate c " +
                "INNER JOIN cpl.programmingLanguage pl " +
                "WHERE c.id=:candidateId";
}
