package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.module.Employee;
import com.example.demo.repo.Employeerepo;
import com.example.demo.service.EmployeeService;
import jakarta.annotation.Resource;
@Service
public class EmpServiceimpl implements EmployeeService {
    @Autowired
    Employeerepo repo;
//	@Override
//	public Employee addEmployee(Employee v) {
//		return repo.save(v);
//	}
//	@Override
//	public void deleteEmployee(Integer id) {
//		
//		repo.deleteById(id);
//	}
//	@Override
//	public List<Employee> getDetails() {
//		
//		return repo.findAll();
//	}
//	@Override
//	public Employee getbyid(Integer id) {
//		
//		return repo.findById(id).orElseThrow(()->new ResourceNotFoundException());
//	}
//	@Override
//	public List<Employee> getbycolor(String color) {
//		
//		return repo.getbycolor(color);
//	}
//	@Override
//	public List<Employee> sortbyprice() {
//		
//		return repo.sortbyprice();
//	}
//	@Override
//	public Employee updatebyid(Employee v1) {
//		Employee v2=repo.findById(v1.getVid()).orElse(null);
//		if(v2!=null) {
//			v2.setVid(v1.getVid());
//			v2.setVcolor(v1.getVcolor());
//			v2.setVmodel(v1.getVmodel());
//			v2.setVname(v1.getVname());
//			v2.setVprice(v1.getVprice());
//			return repo.save(v2);
//		}
//		return null;
//	}
//	@Override
//	public List<Employee> pricemorethen() {
//		
//		return repo.pricemorethen();
//	}
//	@Override
//	public List<Employee> sortbypricecolor() {
//		
//		return repo.sortbypricecolor();
//	}

	@Override
	public Employee addEmployee(Employee v) {
		// TODO Auto-generated method stub
		return repo.save(v);
	}

	@Override
	public void deleteEmployee(Integer id) {
		repo.deleteById(id);
		
	}

	@Override
	public List<Employee> getDetails() {
		return repo.findAll();
	}

	@Override
	public Employee getbyid(Integer id) {
		return repo.findById(id).orElseThrow(()->new ResourceNotFoundException());
	}

//	@Override
//	public List<Employee> getbycolor(String color) {
//		return repo.getbycolor(color);
//	}
//
//	@Override
//	public List<Employee> sortbyprice() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Employee updatebyid(Employee v1) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Employee> pricemorethen() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Employee> sortbypricecolor() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
