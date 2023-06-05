package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.module.Vehicle;
import com.example.demo.service.VehicleService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class VehicleController {  
    @Autowired
	VehicleService vsr;
    
    @PostMapping("/addvehicle")
    ResponseEntity<Vehicle> addvehicle( @RequestBody Vehicle v){
    	return new ResponseEntity<Vehicle>(vsr.addVehicle(v),HttpStatus.CREATED);
    }
    
     @DeleteMapping("/deletebyid")
    void deletebyid(@RequestHeader Integer id){
    	 vsr.deleteVehicle(id);
    	 
    }
     @GetMapping("/getdetails")
     List<Vehicle> getdetails(){
    	 return vsr.getDetails();
     }
     
     @GetMapping("/getbyid")
    	 ResponseEntity<Vehicle> getbyid(@RequestHeader Integer id){
    		 return new ResponseEntity<Vehicle>(vsr.getbyid(id),HttpStatus.FOUND);
    	 }
     @GetMapping("/getbycolor")
     ResponseEntity<List <Vehicle>> getbycolor(@RequestHeader String color){
    	 return new ResponseEntity<List <Vehicle>>(vsr.getbycolor(color),HttpStatus.FOUND);
     }
     @GetMapping("/sortbyprice")
     List<Vehicle> sortbyprice(){
    	 return vsr.sortbyprice();
     }  
     
     @PutMapping("/updatebyid")
     Vehicle updatebyid(@RequestBody Vehicle v) {
    	 return vsr.updatebyid(v);
     }
     
     @GetMapping("/pricemorethen")
     List<Vehicle> pricemorethen(){
    	 return vsr.pricemorethen();
     }
	@GetMapping("/sortpricecolor")
	List<Vehicle> sortpricecolor(){
		return vsr.sortbypricecolor();
	}
}
