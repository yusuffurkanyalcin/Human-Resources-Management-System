package com.example.demohrms.core.results;


public class Result {

    private String message;

    private boolean success;

    public Result(boolean success){
        this.success=success;
    }

    public Result(String message,boolean success){
        this(success);
        this.message=message;
    }

    public Result(String message){
        this.message=message;
    }

    public String getMessage(){
        return this.message;
    }

    public boolean isSuccess(){
        return this.success;
    }

}
