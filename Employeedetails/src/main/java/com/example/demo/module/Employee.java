package com.example.demo.module;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
    @Column(nullable = false)
    private String ename;
    @Column(nullable = false,unique = true)
    private long ephno;
private String eemail;
private double esal;
private String edestination;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public long getEphno() {
	return ephno;
}
public void setEphno(long ephno) {
	this.ephno = ephno;
}
public String getEemail() {
	return eemail;
}
public void setEemail(String eemail) {
	this.eemail = eemail;
}
public double getEsal() {
	return esal;
}
public void setEsal(double esal) {
	this.esal = esal;
}
public String getEdestination() {
	return edestination;
}
public void setEdestination(String edestination) {
	this.edestination = edestination;
}

}
