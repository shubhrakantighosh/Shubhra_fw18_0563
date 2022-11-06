package com.masai.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Address;
import com.masai.model.Employee;

@RestController
public class MyController {
	
	@RequestMapping("/hello")
	public String message() {
		return "Welcome to Spring Boot.";
	}
	
	@RequestMapping("/employee")
	public Employee getEmployee() {
		return new Employee(10, "Ratan", new Address("700102", "Kolkata", "WB"));
	}
	
	
	@RequestMapping("/employees")
	public List<Employee> getEmployees(){
		
		return Arrays.asList(
				
				new Employee(11, "Ratan", new Address("700102", "Kolkata", "WB")),
				new Employee(12, "Shubhra", new Address("698545", "Durgapur", "WB")),
				new Employee(13, "Chirag", new Address("67897", "Bangaluru", "KA")),
				new Employee(14, "Soumya", new Address("45675", "Chennai", "TN")),
				new Employee(15, "Subhadeep", new Address("123456", "assam", "AS"))
														
				);
		
	}
	

}
