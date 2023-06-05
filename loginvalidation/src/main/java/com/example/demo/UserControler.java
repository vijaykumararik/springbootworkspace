package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControler {
    @Autowired
	UserService usr;
    @GetMapping("/login")
    ResponseEntity<Users> userlogin(@RequestHeader String data, @RequestHeader String password) {
    return new ResponseEntity<Users>(usr.login(data, password),HttpStatus.FOUND);
    	
    }
	
}
