package com.example.demohrms.core.business;

import org.modelmapper.ModelMapper;

public class SingleModelMapper extends ModelMapper {

    private static SingleModelMapper instance;

    private SingleModelMapper(){}

    public static SingleModelMapper getInstance(){
        if(instance==null){
            instance= new SingleModelMapper();
        }
        return instance;
    }
}
