package com.microservices.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@AutoConfigurationPackage
public class EmployeeServicetwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServicetwoApplication.class, args);
	}

}
