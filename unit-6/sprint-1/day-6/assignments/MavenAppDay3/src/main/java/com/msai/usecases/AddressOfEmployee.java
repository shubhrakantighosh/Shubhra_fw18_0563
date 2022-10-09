package com.msai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDaoImpl;
import com.masai.exceptions.EmployeeException;

public class AddressOfEmployee {
	
	public void getAddressOfEmployee() {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Employee ID : ");
		int empId=scanner.nextInt();
		
		try {
			
			String result=new EmployeeDaoImpl().getAddressOfEmployee(empId);
			
			System.out.println(result);
			
		} catch (EmployeeException employeeException) {
			System.out.println(employeeException.getMessage());
		}
		
	}

}
