package com.example.demohrms.core.results;

public class ErrorDataResult<T> extends DataResult<T> {

    public ErrorDataResult(T data,String message){
        super(data,message,false);
    }

    public ErrorDataResult(T data){
        super(data,false);
    }
}
