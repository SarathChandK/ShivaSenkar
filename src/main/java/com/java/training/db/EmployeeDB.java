package com.java.training.db;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.java.training.model.Employee;

import javax.annotation.PostConstruct;

@Repository
public class EmployeeDB {
	
	private List<Employee> emp =  new ArrayList<>();
	
	@PostConstruct
	public void init() {
		
		emp.add(new Employee(1, "Selvan", "selvan.b@tcs.com", "Development", "Develpoer"));
		emp.add(new Employee(2, "Hari", "hari.p@tcs.com", "Design", "Framework"));
		
	}
	
	public List<Employee> getAllEmp() {
		return emp;
	}
	
	public Employee getEmpById(int id) {
		Employee temp= null;
		for(Employee emps:emp) {
			if(emps.getId() == id) {
				temp=emps;
			}
		}
		return temp;
	}
	
	public Employee addEmp(Employee emp) {
		this.emp.add(emp);
		return emp;
	}
	
	public Employee updateEmp(Employee emp) {
		for(int i=0;i<this.emp.size();i++) {
			if(this.emp.get(i).getId() == emp.getId()) {
				this.emp.set(i,emp);
				break;
			}
		}
		return emp;
	}
	
	public void deleteEmp(int id) {
		for(int i=0;i<this.emp.size();i++) {
			if(this.emp.get(i).getId() == id) {
				emp.remove(i);
				break;
			}
		}
	}
}
