package com.jsp.demoproject.EmployeeApp.Service;

import com.jsp.demoproject.EmployeeApp.Entity.Employee;
import com.jsp.demoproject.EmployeeApp.Exception.IdNotPresentException;
import com.jsp.demoproject.EmployeeApp.dao.EmployeeDao;
import com.jsp.demoproject.EmployeeApp.dto.ResponseStructure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    public ResponseEntity<ResponseStructure<Employee>> saveEmployee(Employee e) {
        Employee employee = employeeDao.saveEmployee(e);
        ResponseStructure<Employee> rs = new ResponseStructure<Employee>();
        rs.setStatusCode(HttpStatus.OK.value());
        rs.setMessage("Data inserted successfully");
        rs.setData(employee);
        return new ResponseEntity<ResponseStructure<Employee>>(rs, HttpStatus.OK);
    }

    public ResponseEntity<ResponseStructure<Employee>> getEmployeeById(int id) {
        Employee employee = employeeDao.getEmployeeById(id);
        if (employee != null) {
            ResponseStructure<Employee> rs = new ResponseStructure<Employee>();
            rs.setStatusCode(HttpStatus.OK.value());
            rs.setData(employee);
            rs.setMessage("Id is present");
            return new ResponseEntity<ResponseStructure<Employee>>(rs, HttpStatus.OK);
        } else {
            throw new IdNotPresentException("id " + id + "is not present");
        }
    }
}
