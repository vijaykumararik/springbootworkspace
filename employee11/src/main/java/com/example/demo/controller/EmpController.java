package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.madule.Employee;
import com.example.demo.serviceimpl.EmpServiceimpl;

@RestController
public class EmpController {
 @Autowired
	EmpServiceimpl ser;
 @PostMapping("/addemp")
 ResponseEntity<Employee> addemployee( @RequestBody Employee e){
	 return new  ResponseEntity<Employee>(ser.addemployee(e),HttpStatus.OK);
 }
 
 @GetMapping("/getemp")
 ResponseEntity<List<Employee>> getEmp(){
	 return new ResponseEntity<List<Employee>>(ser.getEmployees(),HttpStatus.FOUND);
 }
 @GetMapping("/getbyid")
 ResponseEntity<Employee> getbyid(@RequestHeader Integer id){
	 return new ResponseEntity<Employee>(ser.getbyid(id),HttpStatus.FOUND);
 }
 
}
