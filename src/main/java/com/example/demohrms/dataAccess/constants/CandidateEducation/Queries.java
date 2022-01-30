package com.example.demohrms.dataAccess.constants.CandidateEducation;

public class Queries {
    public final static String GET_ALL_BY_CANDIDATE_ID =
            "SELECT new com.example.demohrms.entities.dtos.CandidateEducationDto(" +
                    "s.name," +
                    "d.name," +
                    "ce.beginningDate," +
                    "ce.endingDate" +
                    ") " +
                    "FROM CandidateEducation ce " +
                    "INNER JOIN ce.school s " +
                    "INNER JOIN ce.department d " +
                    "WHERE ce.candidate.id =:candidateId";
}
