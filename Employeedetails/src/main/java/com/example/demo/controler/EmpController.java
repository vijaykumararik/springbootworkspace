package com.example.demo.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.module.Employee;
import com.example.demo.services.EmployeeService;

@RestController
public class EmpController {
@Autowired
 EmployeeService ser;
   @PostMapping("/addEmp")
	ResponseEntity<Employee> addEmployee(@RequestBody  Employee e){
		return  new ResponseEntity<Employee>(ser.addemply(e),HttpStatus.CREATED)  ;
		
	}
   
   @GetMapping("/empdetails")
   List<Employee> getEmloyees(){
	   return ser.getDetails();
   }
   
   @GetMapping("/empbyid")
   ResponseEntity<Employee> getEmpbyid(@RequestParam Integer id) {
	return new ResponseEntity<Employee>(ser.getEmpById(id),HttpStatus.FOUND);
	   
   }
   @GetMapping("/empbydes")
   ResponseEntity<List<Employee>> geEmpdes(@RequestHeader String designation) {
	return new ResponseEntity<List<Employee>>(ser.getByDesignation(designation),HttpStatus.FOUND);
	   
   }
   
   @PutMapping("/updateemp")
   ResponseEntity<Employee> updateEmp(@RequestBody Employee e){
	   return new ResponseEntity<Employee>(ser.updateEmp(e),HttpStatus.OK);
   }
    
   
   
   
}
