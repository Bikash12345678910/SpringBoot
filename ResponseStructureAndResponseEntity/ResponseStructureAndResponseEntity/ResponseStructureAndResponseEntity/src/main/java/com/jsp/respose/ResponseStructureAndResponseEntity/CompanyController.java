package com.jsp.respose.ResponseStructureAndResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    @GetMapping("/cp")
    public ResponseStructure<Company> fetch(@RequestBody Company c){
        ResponseStructure<Company> cm=new ResponseStructure<Company>();
        cm.setStatusCode(204);
        cm.setMessage("successfully");
        cm.setData(c);
        return cm;
    }
}
