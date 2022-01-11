package com.example.demohrms.core.business;

import com.example.demohrms.core.results.Result;

public class RunRules {

    public static Result run(Result... results){
        Result result = null;
        for(Result r : results){
            if(r.isSuccess()==false){
                result=r;
                break;
            }
        }
        return result;
    }
}
