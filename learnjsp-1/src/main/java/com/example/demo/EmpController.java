package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmpController {
	@Autowired
	EmpRepo repo;
	
    @RequestMapping("/login")
	String login(HttpSession h,String data,String password) {
//    	Employee u1=repo.validate(data, password);
//		if(u1!=null) {
//			if(u1.get.equals(password)) {
//				return u1;
//			}else {
//				throw new ;
//			}
//		}
//		else {
//			 ;
//		}
//		
//	}
    	return "login.jsp";
    }
    @RequestMapping("/addemp")
    String addemp( HttpSession h,Employee e) {
    	
     repo.save(e);
     h.setAttribute("message", "Employee data Added");
    	
    	
    	return "addemp.jsp";
    	
    }
    
    
}
