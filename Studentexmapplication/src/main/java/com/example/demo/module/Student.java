package com.example.demo.module;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
	private String id;
	private String name;
	@Column(unique = true)
	private String email;
	@Column(length = 10)
	private long phno;
	private String gender;
	private String cost;
	private String collegename;
	private String yearofpassout;
	private String degreepercentage;
	private String address;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getYearofpassout() {
		return yearofpassout;
	}
	public void setYearofpassout(String yearofpassout) {
		this.yearofpassout = yearofpassout;
	}
	public String getDegreepercentage() {
		return degreepercentage;
	}
	public void setDegreepercentage(String degreepercentage) {
		this.degreepercentage = degreepercentage;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
