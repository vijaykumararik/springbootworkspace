package com.example.demo.service;

import java.util.List;

import com.example.demo.module.Employee;

public interface EmployeeService {
   
	Employee addEmployee(Employee v);
	void deleteEmployee(Integer id);
	List<Employee> getDetails();
	Employee getbyid(Integer id);
//	List<Employee> getbycolor(String color);
//	List<Employee> sortbyprice();
//	Employee updatebyid(Employee v1);
//	List<Employee> pricemorethen();
//	List<Employee> sortbypricecolor();
	

}
