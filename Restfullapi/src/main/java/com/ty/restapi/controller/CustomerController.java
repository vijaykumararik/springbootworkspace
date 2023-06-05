package com.ty.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.restapi.dto.Customer;
import com.ty.restapi.response.ResponceStucture;
import com.ty.restapi.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired 
	private CustomerService customerService;
	@PostMapping(path = "/persist")
	ResponseEntity<?> customerpersist(@RequestBody Customer customer){
	ResponceStucture<?> responceStructure  = customerService.customerpersist(customer);
		
		return new ResponseEntity<>(responceStructure,responceStructure.getHttpStatus());
	}
	
	@GetMapping(path = "/fetchall")
	ResponseEntity<?> findallcustomers(){
		ResponceStucture<?> responceStucture=customerService.findallcustomers();
		return new ResponseEntity<ResponceStucture<?>>(responceStucture,responceStucture.getHttpStatus());
	}
	
	@GetMapping(path = "/getbyid")
	ResponseEntity<?> getbyid(@RequestParam Integer id){
		ResponceStucture<?> responceStucture=customerService.getbyid(id);
		return new ResponseEntity<>(responceStucture,responceStucture.getHttpStatus());
	}
	
	
	
	
	
	
	
	
	
//       @GetMapping(path = "/fetch")
//       public ResponseEntity<?>getcustomer(@RequestParam int cusid){
//    	   if(cusid>=1) {
//    		 return new  ResponseEntity<> ("valid user id",HttpStatus.OK);
//    		   
//    	   }
//    	   return new ResponseEntity<>("not valid id",HttpStatus.NOT_FOUND);
//       }
//       
//       @DeleteMapping(path = "/delete/{cusid}")
//       public ResponseEntity<?> deletecustomer(@PathVariable int cusid){
//    	   return new ResponseEntity<>("customer data deleted ",HttpStatus.OK);
//       }
        
       

}
