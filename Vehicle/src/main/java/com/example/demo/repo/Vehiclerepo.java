 package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.module.Vehicle;

public interface Vehiclerepo extends JpaRepository<Vehicle, Integer> {
 
	
	@Query(value = "select * from vehicle where vcolor=?1",nativeQuery = true)
	List<Vehicle> getbycolor(String color);
	
	@Query(value="select * from vehicle order by vprice ",nativeQuery = true)
		List<Vehicle> sortbyprice();
	
  @Query(value = "select * from vehicle where vprice>= 1000000",nativeQuery = true)
  List<Vehicle> pricemorethen();
  
  @Query(value = "select * from vehicle order by vprice,order by vcolor ",nativeQuery = true)
  List<Vehicle> sortbypricecolor();
}

