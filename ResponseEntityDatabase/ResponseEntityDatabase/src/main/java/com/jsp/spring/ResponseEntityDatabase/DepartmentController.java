package com.jsp.spring.ResponseEntityDatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentRepository dr;

    @PostMapping("/department")
    public ResponseEntity<ResponseStructure<Department>> saveData(@RequestBody Department d){
        dr.save(d);
        ResponseStructure<Department> rs=new ResponseStructure<Department>();
        rs.setStatusCode(200);
        rs.setMessage("Successfully  save department");
        rs.setData(d);
        return new ResponseEntity<ResponseStructure<Department>>(rs, HttpStatus.OK);
    }
    @GetMapping("/fetch")
    public ResponseEntity<ResponseStructure<Department>> fetchData(@PathVariable int id){
        Optional<Department> fe=dr.findById(id);
       dr.findById(id);
        ResponseStructure<Department> rs=new ResponseStructure<Department>();
        rs.setStatusCode(202);
        rs.setMessage("successfully update");
//        rs.setData(id);
        return new ResponseEntity<ResponseStructure<Department>>(rs,HttpStatus.OK);
    }
}
