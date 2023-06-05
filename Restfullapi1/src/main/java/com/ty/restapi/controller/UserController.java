package com.ty.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ty.restapi.dto.User;
import com.ty.restapi.service.userService;


@RestController
public class UserController {

	@Autowired 
	private userService userService;
	 @PostMapping(path = "/adduser")
	 ResponseEntity<?> adduser( @RequestBody User user){
		 return new ResponseEntity<>(user,HttpStatus.OK);
	 }
	 
	 @GetMapping(path = "/getuser")
	 ResponseEntity<?>getuser(Integer id){
		 return new ResponseEntity<>("valid userid",HttpStatus.OK);
	 }
	 
	 @DeleteMapping(path = "/delete/{id}")
	 ResponseEntity<?>deletebyid(@PathVariable Integer id){
		 return new ResponseEntity<> ("user deleted ",HttpStatus.OK);
	 }
}
