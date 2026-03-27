package com.jsp.demoproject.EmployeeApp.Exception;

import com.jsp.demoproject.EmployeeApp.Entity.Employee;
import com.jsp.demoproject.EmployeeApp.dto.ResponseStructure;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class EmployeeException extends ResponseEntityExceptionHandler {
    public ResponseEntity<ResponseStructure<Employee>> handleException(IdNotPresentException  e ){
        ResponseStructure<Employee> rs=new ResponseStructure<Employee>();
        rs.setStatusCode(HttpStatus.NOT_FOUND.value());
        rs.setMessage(e.getMessage());
        rs.setData(null);
        return new ResponseEntity<ResponseStructure<Employee>>(rs,HttpStatus.NOT_FOUND);
    }
}
