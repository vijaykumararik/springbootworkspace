package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.madule.Employee;

public interface Emprepo extends JpaRepository<Employee, Integer>{
	

}
