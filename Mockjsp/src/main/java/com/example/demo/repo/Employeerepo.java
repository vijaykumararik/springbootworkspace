 package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.module.Employee;

public interface Employeerepo extends JpaRepository<Employee, Integer> {
 
	
//	@Query(value = "select * from Employee where vcolor=?1",nativeQuery = true)
//	List<Employee> getbycolor(String color);
//	
//	@Query(value="select * from Employee order by vprice ",nativeQuery = true)
//		List<Employee> sortbyprice();
//	
//  @Query(value = "select * from Employee where vprice>= 1000000",nativeQuery = true)
//  List<Employee> pricemorethen();
//  
//  @Query(value = "select * from Employee order by vprice,order by vcolor ",nativeQuery = true)
//  List<Employee> sortbypricecolor();
}

