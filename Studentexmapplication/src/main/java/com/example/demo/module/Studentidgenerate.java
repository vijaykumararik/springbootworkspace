package com.example.demo.module;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Studentidgenerate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return "Studentidgenerate [sid=" + sid + "]";
	}
    
}
