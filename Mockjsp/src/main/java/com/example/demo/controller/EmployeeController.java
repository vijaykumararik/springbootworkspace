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

import com.example.demo.module.Employee;
import com.example.demo.service.EmployeeService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class EmployeeController {
    @Autowired
	EmployeeService vsr;
    
    @PostMapping("/addEmployee")
    ResponseEntity<Employee> addEmployee( @RequestBody Employee v){
    	return new ResponseEntity<Employee>(vsr.addEmployee(v),HttpStatus.CREATED);
    }
    
     @DeleteMapping("/deletebyid")
    void deletebyid(@RequestHeader Integer id){
    	 vsr.deleteEmployee(id);
    	 
    }
     @GetMapping("/getdetails")
     List<Employee> getdetails(){
    	 return vsr.getDetails();
     }
     
     @GetMapping("/getbyid")
    	 ResponseEntity<Employee> getbyid(@RequestHeader Integer id){
    		 return new ResponseEntity<Employee>(vsr.getbyid(id),HttpStatus.FOUND);
    	 }
//     @GetMapping("/getbycolor")
//     ResponseEntity<List <Employee>> getbycolor(@RequestHeader String color){
//    	 return new ResponseEntity<List <Employee>>(vsr.getbycolor(color),HttpStatus.FOUND);
//     }
//     @GetMapping("/sortbyprice")
//     List<Employee> sortbyprice(){
//    	 return vsr.sortbyprice();
//     }  
//     
//     @PutMapping("/updatebyid")
//     Employee updatebyid(@RequestBody Employee v) {
//    	 return vsr.updatebyid(v);
//     }
//     
//     @GetMapping("/pricemorethen")
//     List<Employee> pricemorethen(){
//    	 return vsr.pricemorethen();
//     }
//	@GetMapping("/sortpricecolor")
//	List<Employee> sortpricecolor(){
//		return vsr.sortbypricecolor();
//	}
}
