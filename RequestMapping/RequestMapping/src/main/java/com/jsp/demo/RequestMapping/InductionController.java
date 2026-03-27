package com.jsp.demo.RequestMapping;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class InductionController {
    @GetMapping(value = "/induction", produces = MediaType.APPLICATION_XML_VALUE)
    public Induction fetchData(){
        Induction i=new Induction();
        i.setId(1);
        i.setBrand("Pigeon");
        i.setPrice(1000);
        return i;
    }
    @PostMapping(value = "/induction" , consumes = MediaType.APPLICATION_XML_VALUE)
    public String saveData(@RequestBody Induction in){

        return "Induction Id :"+in.getId();
    }
    @PostMapping(value = "/data" , consumes = MediaType.APPLICATION_XML_VALUE , produces = MediaType.APPLICATION_XML_VALUE)
    public Induction data(@RequestBody Induction i){
        return i;
    }
}
