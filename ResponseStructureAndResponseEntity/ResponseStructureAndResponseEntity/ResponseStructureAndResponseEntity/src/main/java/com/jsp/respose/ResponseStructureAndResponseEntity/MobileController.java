package com.jsp.respose.ResponseStructureAndResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MobileController {
    @GetMapping("/data")
    public ResponseStructure<Mobile> fetch(@RequestBody Mobile m){
        ResponseStructure<Mobile> rs=new ResponseStructure<Mobile>();
        rs.setStatusCode(200);
        rs.setMessage("successful");
        rs.setData(m);
        return rs;
    }
}
