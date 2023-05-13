package com.java.training.model;

import java.util.List;

public class Employee {

	String email;
	String name;
	int id;
	String department;
	String designation;
	
	public Employee(int id,String name, String email, String department, String designation) {
		this.name = name;
		this.email = email;
		this.id = id;
		this.department = department;
		this.designation = designation;
	}
	
	private void execute() {
		System.out.println("Default method called");
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getId() {
		return id;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
