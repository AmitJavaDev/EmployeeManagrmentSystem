package com.awazpact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.awazpact.entity.Employee;
import com.awazpact.repository.EmployeeRepository;
@Service
public class EmployeeService {
	
	@Autowired
	
	private EmployeeRepository employeeRepository;
	
	
	public Employee registration(Employee emp) {		
		
		return employeeRepository.save(emp);
		
	}
	public List<Employee> getAll(){
		return employeeRepository.findAll();
	}
	
}
