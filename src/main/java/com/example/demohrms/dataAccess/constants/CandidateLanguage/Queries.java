package com.example.demohrms.dataAccess.constants.CandidateLanguage;

import org.springframework.data.jpa.repository.Query;

public class Queries {

    public final static String GET_ALL_BY_CANDIDATE_ID =
            "SELECT new com.example.demohrms.entities.dtos.CandidateLanguageDto(" +
                    "l.name," +
                    "cl.level" +
                    ") " +
                    "FROM CandidateLanguage cl " +
                    "INNER JOIN cl.language l " +
                    "WHERE cl.candidate.id =:candidateId";
}
