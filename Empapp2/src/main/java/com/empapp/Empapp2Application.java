package com.empapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import com.empapp.model.dao.Employee;
import com.empapp.model.service.EmployeeService;

@EnableWebSecurity
@SpringBootApplication
public class Empapp2Application implements CommandLineRunner{

	@Autowired
	private EmployeeService empService;
	
	public static void main(String[] args) {
		SpringApplication.run(Empapp2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	//	System.out.println("rec are saved...");
		empService.save(new Employee("mani", 33));
		empService.save(new Employee("vinne", 30));
		empService.save(new Employee("vedu", 10));
		empService.save(new Employee("ganta", 5));		
	}
}

