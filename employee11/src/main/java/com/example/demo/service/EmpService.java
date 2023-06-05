package com.example.demo.service;

import java.util.List;

import com.example.demo.madule.Employee;

public interface EmpService {
 Employee addemployee(Employee e);
 List<Employee> getEmployees();
 Employee getbyid(Integer id);
}
