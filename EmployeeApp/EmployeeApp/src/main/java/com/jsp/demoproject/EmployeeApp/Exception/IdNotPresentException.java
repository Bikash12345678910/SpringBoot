package com.jsp.demoproject.EmployeeApp.Exception;

public class IdNotPresentException extends  RuntimeException{
    public IdNotPresentException(String message){
        super(message);
    }
}
