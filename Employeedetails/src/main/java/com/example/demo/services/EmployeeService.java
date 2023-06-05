package com.example.demo.services;

import java.util.List;

import com.example.demo.module.Employee;

public interface EmployeeService {
Employee addemply(Employee e);
List<Employee> getDetails();
Employee getEmpById(Integer id);
List<Employee> getByDesignation(String designation);
Employee updateEmp(Employee e1);
}
