package com.awazpact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.awazpact.entity.Employee;
import com.awazpact.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/registerEmp")
	public Employee registerEmployee(@RequestBody Employee emp) {

		return employeeService.registration(emp);

	}
	
	@GetMapping("/getAll")
	public List<Employee> getAllEmployee(){
		return employeeService.getAll();
	}

}
