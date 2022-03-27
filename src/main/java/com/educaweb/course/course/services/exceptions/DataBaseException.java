package com.educaweb.course.course.services.exceptions;

public class DataBaseException extends RuntimeException{

    private static final long serialVersionUID = -814528571420009059L;

    public DataBaseException(String msg){
        super(msg);
    }
}
