package com.example.demo.service;

import java.util.List;

import com.example.demo.module.Vehicle;

public interface VehicleService {
   
	Vehicle addVehicle(Vehicle v);
	void deleteVehicle(Integer id);
	List<Vehicle> getDetails();
	Vehicle getbyid(Integer id);
	List<Vehicle> getbycolor(String color);
	List<Vehicle> sortbyprice();
	Vehicle updatebyid(Vehicle v1);
	List<Vehicle> pricemorethen();
	List<Vehicle> sortbypricecolor();
	

}
