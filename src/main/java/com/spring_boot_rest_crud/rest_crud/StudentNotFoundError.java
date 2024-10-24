package com.spring_boot_rest_crud.rest_crud;

public class StudentNotFoundError extends RuntimeException{

    public StudentNotFoundError(String message){
        super(message);
    }

}
