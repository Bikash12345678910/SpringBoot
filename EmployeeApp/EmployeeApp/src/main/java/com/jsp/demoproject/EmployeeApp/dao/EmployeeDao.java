package com.jsp.demoproject.EmployeeApp.dao;

import com.jsp.demoproject.EmployeeApp.Entity.Employee;
import com.jsp.demoproject.EmployeeApp.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class EmployeeDao {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee e){
        return employeeRepository.save(e);
    }
    public Employee getEmployeeById(int id){
        Optional<Employee> op=employeeRepository.findById(id);
        if(op.isPresent()){
            return op.get();
        }
        else{
            return null;
        }
    }
}
