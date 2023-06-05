package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.module.Studentidgenerate;

public interface Stdidgenerate extends JpaRepository<Studentidgenerate, Integer> {

	@Query(value = "select sid from studentidgenerate order by sid desc limit 1",nativeQuery = true)
	public Integer getsid();
	
}
