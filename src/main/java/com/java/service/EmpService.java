package com.java.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.training.db.EmployeeDB;
import com.java.training.model.Employee;

@Service
public class EmpService {
	
	@Autowired
	EmployeeDB db;
	
	public List<Employee> getAllEmp() {
		return db.getAllEmp();
	}
	
	public Employee getEmpById(int id) {
		return db.getEmpById(id);
	}
	
	public Employee addEmp(Employee emp) {
		return db.addEmp(emp);
	}
	
	public Employee updateEmp(Employee emp) {
		return db.updateEmp(emp);
	}
	
	public void deleteEmp(int id) {
		db.deleteEmp(id);
	}
	
}
