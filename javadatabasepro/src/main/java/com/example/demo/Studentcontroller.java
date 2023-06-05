package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class Studentcontroller {
    @Autowired
	Studentrepositary repo;
    @RequestMapping("/home")
    String home() {
    	return "home.jsp";
    }
    @RequestMapping("/addstudent")
    String addstudent(HttpSession h,Student s) {
    	try {
    		Student s1=repo.findById(s.getId()).orElse(null);
    		if(s1!=null) {
    			throw new IdallreadyFound();
    		}else {
    			repo.save(s);
    			h.setAttribute("message","student has been added");
    		}
    	}
    	catch (Exception e) {
    		h.setAttribute("message", e.getMessage());
			
		}
    	return "home.jsp";
    	
    }
    
//    @RequestMapping("/getStudentId")
//    String getById(HttpSession h1,Integer id)
//    {
//    	
//    	
//    }
 
}
