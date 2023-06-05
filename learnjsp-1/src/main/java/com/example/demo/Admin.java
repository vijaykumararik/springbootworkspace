package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int aid;
	private String ausername;
private String aemail;
private String apassword;
public String getAusername() {
	return ausername;
}
public void setAusername(String ausername) {
	this.ausername = ausername;
}
public String getAemail() {
	return aemail;
}
public void setAemail(String aemail) {
	this.aemail = aemail;
}
public String getApassword() {
	return apassword;
}
public void setApassword(String apassword) {
	this.apassword = apassword;
}
@Override
public String toString() {
	return "Admin [ausername=" + ausername + ", aemail=" + aemail + ", apassword=" + apassword + "]";
}

}
