package com.jsp.demoproject.EmployeeApp.Controller;

import com.jsp.demoproject.EmployeeApp.Entity.Employee;
import com.jsp.demoproject.EmployeeApp.Service.EmployeeService;
import com.jsp.demoproject.EmployeeApp.dto.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/employee")
    public ResponseEntity<ResponseStructure<Employee>> saveEmployee(@RequestBody Employee e){
        return employeeService.saveEmployee(e);
    }
    @GetMapping("/employee/{id}")
    public ResponseEntity<ResponseStructure<Employee>> getEmployeeId(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }
}
