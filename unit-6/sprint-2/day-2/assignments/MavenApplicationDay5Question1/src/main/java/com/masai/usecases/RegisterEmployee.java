package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDaoImpl;
import com.masai.dao.exceptions.EmployeeException;
import com.masai.model.Address;
import com.masai.model.Employee;

public class RegisterEmployee {
	
	public static void main(String[] args) {
		
		try {
			
			Employee employee=new Employee();
			
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Enter Employee Name : ");
			employee.setName(scanner.next());
			System.out.println("Enter Employee Email : ");
			employee.setEmail(scanner.next());
			System.out.println("Enter Employee Mobile Number : ");
			employee.setMobileNumber(scanner.next());
			
			for(int i=1;i<=3;i++) {
				
				System.out.println("Enter Employee "+i+" Address : ");
				
				System.out.println("Enter State :");
				String state=scanner.next();
			    System.out.println("Enter City :");
			    String city=scanner.next();
			    System.out.println("Enter Pin Code:");
				String pinCode=scanner.next();
				System.out.println("Enter Type of Address :");
				String type=scanner.next();
				employee.getAddresses().add(new Address(state, city, pinCode, type));
				
			}

			String result=new EmployeeDaoImpl().saveEmployee(employee);
			
			System.out.println(result);
			
		} catch (EmployeeException employeeException) {
			System.out.println(employeeException.getMessage());
		}
		
	}
	
}
