package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.module.Student;
import com.example.demo.service.StudentService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class StudentController {
   @Autowired
   StudentService ser;
    @PostMapping("/addstudent")
    ResponseEntity<Student> addstd(@RequestBody Student s1){
    	return new ResponseEntity<Student>(ser.addstudent(s1),HttpStatus.OK);
    }
    @GetMapping("/getallstudents")
    List<Student> getallstd(){
    	return ser.getallstudents();
    	
    }
    
    @GetMapping("/getbyid")
    ResponseEntity<Student> getbysid(@RequestHeader String id){
    	return new ResponseEntity<Student>(ser.getbyid(id),HttpStatus.FOUND);
    }
    
    
}
