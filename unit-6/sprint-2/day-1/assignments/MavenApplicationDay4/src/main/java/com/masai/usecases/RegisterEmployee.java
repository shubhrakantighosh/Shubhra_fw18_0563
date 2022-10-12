package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exceptions.EmployeeException;
import com.masai.model.Employee;

public class RegisterEmployee {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		try {
			
			Employee employee=new Employee();
			
			System.out.println("Enter Employee ID :");	
			employee.setEmpId(scanner.nextInt());
			
			EmployeeDao employeeDao=new EmployeeDaoImpl();
		
			employee=employeeDao.getEmployeeById(employee.getEmpId());
			
			if(employee==null) {
				
				employee=new Employee();

			
				System.out.println("Enter Employee Address :");	
				employee.setAddress(scanner.next());
				
				System.out.println("Enter Employee Name :");	
				employee.setName(scanner.next());
			
			    System.out.println("Enter Employee Salary :");	
			    employee.setSalary(scanner.nextInt());
			
			    employee=employeeDao.registerEmployee(employee);
			    
			    if(employee!=null) {
			    	System.out.println("Register Successfully.");
			    }
			    
			    	
			}else System.out.println("Employee ID Already Exist.");
			
		} catch (EmployeeException employeeException) {
			
			System.out.println(employeeException.getMessage());
		}
		
	}
	
}
