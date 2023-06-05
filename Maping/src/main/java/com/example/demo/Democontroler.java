package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionIdListener;


@Controller//localhost:8080
public class Democontroler {
	//localhost:8080/home
	@RequestMapping("/home")
	@ResponseBody
	String display1() {
		System.out.println("Hi hello");
		return "hello spring boot application";
	}
	
	//localhost:8080/index
		@RequestMapping("/index")
		String display2(HttpSession h1) {
			h1.setAttribute("value", "virat");
			return "home.jsp";
		}
		@ResponseBody
		@RequestMapping("/index2")
		String display3(String name) {
			return "<h1>"+name+"</h1>";
			
		}
		
		

}
