package com.microservices.main.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.microservices.main.entity.Employee;
import com.microservices.main.repo.EmployeeRepository;
@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Bean
	public Optional<Employee> getEmployeeById(int id) {

		 Optional<Employee>  employee = employeeRepository.findById(id);
		 return employee;
	}



}
