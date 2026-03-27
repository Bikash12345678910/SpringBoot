package com.jsp.demo.RequestMapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jsp/ty")
public class ControllerDemo {
    @PostMapping("/save")
    public String saveData(){
        return "Saved data";
    }

    @GetMapping("/fetch")
    public String fetchdata(){
        return "Fetched data";
    }

    @PutMapping("/update")
    public String updateData(){
        return "Updated data";
    }
}
