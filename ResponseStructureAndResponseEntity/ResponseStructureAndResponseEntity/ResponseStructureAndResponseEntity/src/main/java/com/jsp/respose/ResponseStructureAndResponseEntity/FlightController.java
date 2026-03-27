package com.jsp.respose.ResponseStructureAndResponseEntity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FlightController {
    @PostMapping("/book")
    public ResponseEntity<ResponseStructure<Flight>> bookTicket(@RequestBody Flight f){
        ResponseStructure rs=new ResponseStructure();
        rs.setStatusCode(200);
        rs.setMessage("success");
        rs.setData(f);
        return new ResponseEntity<ResponseStructure<Flight>>(rs, HttpStatus.OK);
    }
    @GetMapping("/book")
    public ResponseEntity<ResponseStructure<Flight>> findFlight(@RequestParam int id){
        if(id==1){
            Flight f=new Flight();
            f.setId(1);
            f.setSource("kolkata");
            f.setDestination("Delhi");

            ResponseStructure<Flight> rs=new ResponseStructure<Flight>();
            rs.setStatusCode(200);
            rs.setMessage("success");
            rs.setData(f);
            return new ResponseEntity<ResponseStructure<Flight>>(rs,HttpStatus.OK);
        }
        else{
            ResponseStructure<Flight> rs=new ResponseStructure<Flight>();
            rs.setStatusCode(404);
            rs.setMessage("Id Not Found");
            rs.setData(null);
            return new ResponseEntity<ResponseStructure<Flight>>(rs,HttpStatus.NOT_FOUND);
        }
    }
}
