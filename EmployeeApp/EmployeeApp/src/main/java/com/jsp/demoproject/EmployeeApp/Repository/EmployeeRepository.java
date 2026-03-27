package com.jsp.demoproject.EmployeeApp.Repository;

import com.jsp.demoproject.EmployeeApp.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<Employee,Integer> {

}
