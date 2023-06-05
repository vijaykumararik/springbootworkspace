package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoutException;
import com.example.demo.module.Employee;
import com.example.demo.repo.EmployeeRepo;
import com.example.demo.services.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService {
  @Autowired
	EmployeeRepo repo ;
	
	
	@Override
	public Employee addemply(Employee e) {
		
		return  repo.save(e);
	}


	@Override
	public List<Employee> getDetails() {
		List<Employee> details= repo.findAll();
		
		return  details;
	}


	@Override
	public Employee getEmpById(Integer id) {
		
		return repo.findById(id).orElseThrow(()-> new ResourceNotFoutException("Employee", "id", id));
	}


	@Override
	public List<Employee> getByDesignation(String designation) {
		
		return repo.getbydesignation(designation);
	}


	@Override
	public Employee updateEmp(Employee e1) {
		Employee e2=repo.findById(e1.getEid()).orElse(null);
		if(e2!=null) {
			e2.setEdestination(e1.getEdestination());
			e2.setEemail(e1.getEemail());
			e2.setEname(e1.getEname());
			e2.setEphno(e1.getEphno());
			e2.setEsal(e1.getEsal());
			return repo.save(e2);
		}else {
			throw new ResourceNotFoutException("emp", "id", e1.getEid());
		}
		
	}
	

}
