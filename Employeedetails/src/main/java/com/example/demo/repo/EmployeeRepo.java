package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.module.Employee;

public interface EmployeeRepo  extends JpaRepository<Employee, Integer>{

	@Query(value="select * from employee where edestination =?1",nativeQuery = true)
	List<Employee> getbydesignation(String designation);
}
