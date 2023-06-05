package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {
    @Id
	private int id;
private String uname;
private String uemail;
private String upassword;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUemail() {
	return uemail;
}
public void setUemail(String uemail) {
	this.uemail = uemail;
}
public String getUpassword() {
	return upassword;
}
public void setUpassword(String upassword) {
	this.upassword = upassword;
}
@Override
public String toString() {
	return "Users [id=" + id + ", uname=" + uname + ", uemail=" + uemail + ", upassword=" + upassword + "]";
}



}
