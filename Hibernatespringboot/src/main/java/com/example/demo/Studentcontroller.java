package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class Studentcontroller {
    @RequestMapping("/home")
	String home() {
	return "main.jsp";
}
    String addStudent(HttpSession h1,Student s) {
    	
    }
}
