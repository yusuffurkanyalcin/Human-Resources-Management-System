package com.example.demohrms.core.results;

public class SuccessDataResult<T> extends DataResult<T>{

    public SuccessDataResult(T data, String message){
        super(data,message,true);
    }

    public SuccessDataResult(T data){
        super(data,true);
    }

}
