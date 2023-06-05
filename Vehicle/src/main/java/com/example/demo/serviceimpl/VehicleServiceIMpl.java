package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.module.Vehicle;
import com.example.demo.repo.Vehiclerepo;
import com.example.demo.service.VehicleService;

import jakarta.annotation.Resource;
@Service
public class VehicleServiceIMpl implements VehicleService {
    @Autowired
	Vehiclerepo repo;
	@Override
	public Vehicle addVehicle(Vehicle v) {
		return repo.save(v);
	}
	@Override
	public void deleteVehicle(Integer id) {
		
		repo.deleteById(id);
	}
	@Override
	public List<Vehicle> getDetails() {
		
		return repo.findAll();
	}
	@Override
	public Vehicle getbyid(Integer id) {
		
		return repo.findById(id).orElseThrow(()->new ResourceNotFoundException());
	}
	@Override
	public List<Vehicle> getbycolor(String color) {
		
		return repo.getbycolor(color);
	}
	@Override
	public List<Vehicle> sortbyprice() {
		
		return repo.sortbyprice();
	}
	@Override
	public Vehicle updatebyid(Vehicle v1) {
		Vehicle v2=repo.findById(v1.getVid()).orElse(null);
		if(v2!=null) {
			v2.setVid(v1.getVid());
			v2.setVcolor(v1.getVcolor());
			v2.setVmodel(v1.getVmodel());
			v2.setVname(v1.getVname());
			v2.setVprice(v1.getVprice());
			return repo.save(v2);
		}
		return null;
	}
	@Override
	public List<Vehicle> pricemorethen() {
		
		return repo.pricemorethen();
	}
	@Override
	public List<Vehicle> sortbypricecolor() {
		
		return repo.sortbypricecolor();
	}

}
