package com.java.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.service.EmpService;
import com.java.training.model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmpService service;
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeId(@PathVariable("id") int id) {
		return service.getEmpById(id);
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return service.getAllEmp();
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return service.addEmp(employee);
	}
	
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return service.updateEmp(employee);
	}
	
	@DeleteMapping("/employee/{id}")
	public void deleteEmployeeId(@PathVariable("id") int id) {
		service.deleteEmp(id);
	}

}
