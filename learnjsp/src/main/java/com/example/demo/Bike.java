package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Bike {
    @Id
	private int id;
private String name;
private String color;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
@Override
public String toString() {
	return "Bike [id=" + id + ", name=" + name + ", color=" + color + "]";
}


}
