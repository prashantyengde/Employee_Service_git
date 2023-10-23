package com.microservices.main.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.main.entity.Employee;
import com.microservices.main.service.EmployeeService;

@RestController
public class EmployeeController {


	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees/{id}")
	public ResponseEntity<?> getEmployeeDetails(@PathVariable("id") int id){

		Optional<Employee> employee  = employeeService.getEmployeeById(id);

		return new ResponseEntity<>(employee, HttpStatus.OK);
	}


}
