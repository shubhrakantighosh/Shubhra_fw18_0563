package com.msai.usecases;

import java.util.Scanner;


import com.masai.dao.EmployeeDaoImpl;
import com.masai.entities.Employee;
import com.masai.exceptions.EmployeeException;

public class SaveEmployee {
	
	public void save() {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Employee ID : ");
		int empId=scanner.nextInt();
		System.out.println("Enter Employee Name : ");
		String name=scanner.next();
		System.out.println("Enter Employee Address : ");
		String address=scanner.next();
		System.out.println("Enter Employee Salary: ");
		int salary=scanner.nextInt();
		
		Employee employee=new Employee(empId, name, address, salary);
		
		
		try {
			new EmployeeDaoImpl().save(employee);
		} catch (EmployeeException employeeException) {
			System.out.println(employeeException.getMessage());
		}
		
	}
}
