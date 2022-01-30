package com.example.demohrms.dataAccess.constants.JobAdvertisement;

public class Queries {
    public final static String IN_ACTIVE_JOB_ADVERTISEMENTS = "SELECT " +
            "NEW com.example.demohrms.entities.dtos.JobAdvertisementShowDto(" +
            "ja.id," +
            "e.companyName," +
            "c.cityName," +
            "jt.title," +
            "ja.positionDescription," +
            "ja.openPosition," +
            "ja.createdDate," +
            "ja.lastApplyDate,"+
            "work_type.type," +
            "work_time_type.timeType," +
            "ja.minSalary," +
             "ja.maxSalary" +
            ") " +
            "FROM JobAdvertisement ja INNER JOIN ja.employer e "+
            "INNER JOIN ja.city c "+
            "INNER JOIN ja.jobTitle jt "+
            "INNER JOIN ja.workType work_type "+
            "INNER JOIN ja.workTimeType work_time_type "+
            "WHERE ja.status=false ";

    public final static String ACTIVE_JOB_ADVERTISEMENTS = "SELECT " +
            "NEW com.example.demohrms.entities.dtos.JobAdvertisementShowDto(" +
            "ja.id," +
            "e.companyName," +
            "c.cityName," +
            "jt.title," +
            "ja.positionDescription," +
            "ja.openPosition," +
            "ja.createdDate," +
            "ja.lastApplyDate,"+
            "work_type.type," +
            "work_time_type.timeType," +
            "ja.minSalary," +
            "ja.maxSalary" +
            ") " +
            "FROM JobAdvertisement ja INNER JOIN ja.employer e "+
            "INNER JOIN ja.city c "+
            "INNER JOIN ja.jobTitle jt "+
            "INNER JOIN ja.workType work_type "+
            "INNER JOIN ja.workTimeType work_time_type "+
            "WHERE ja.status=true ";

    public final static String GET_ALL_INACTIVES_BY_EMPLOYER_ID = "SELECT " +
            "NEW com.example.demohrms.entities.dtos.JobAdvertisementShowDto(" +
            "ja.id," +
            "e.companyName," +
            "c.cityName," +
            "jt.title," +
            "ja.positionDescription," +
            "ja.openPosition," +
            "ja.createdDate," +
            "ja.lastApplyDate,"+
            "work_type.type," +
            "work_time_type.timeType," +
            "ja.minSalary," +
            "ja.maxSalary" +
            ") " +
            "FROM JobAdvertisement ja INNER JOIN ja.employer e "+
            "INNER JOIN ja.city c "+
            "INNER JOIN ja.jobTitle jt "+
            "INNER JOIN ja.workType work_type "+
            "INNER JOIN ja.workTimeType work_time_type "+
            "WHERE ja.status=false "+
            "AND "+
            "e.id=:employerId";

    public final static String GET_ALL_ACTIVES_BY_EMPLOYER_ID = "SELECT " +
            "NEW com.example.demohrms.entities.dtos.JobAdvertisementShowDto(" +
            "ja.id," +
            "e.companyName," +
            "c.cityName," +
            "jt.title," +
            "ja.positionDescription," +
            "ja.openPosition," +
            "ja.createdDate," +
            "ja.lastApplyDate,"+
            "work_type.type," +
            "work_time_type.timeType," +
            "ja.minSalary," +
            "ja.maxSalary" +
            ") " +
            "FROM JobAdvertisement ja INNER JOIN ja.employer e "+
            "INNER JOIN ja.city c "+
            "INNER JOIN ja.jobTitle jt "+
            "INNER JOIN ja.workType work_type "+
            "INNER JOIN ja.workTimeType work_time_type "+
            "WHERE ja.status=true "+
            "AND "+
            "e.id=:employerId";
}
