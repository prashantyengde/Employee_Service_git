package com.microservices.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.microservices.main.entity.Employee;

 
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
