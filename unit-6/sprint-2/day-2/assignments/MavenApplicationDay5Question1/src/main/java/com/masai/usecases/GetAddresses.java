package com.masai.usecases;

import java.util.Scanner;
import java.util.Set;

import com.masai.dao.EmployeeDaoImpl;
import com.masai.dao.exceptions.EmployeeException;
import com.masai.model.Address;

public class GetAddresses {
	
	public static void main(String[] args) {
		
		try {
			
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Enter Employee ID :");
			int cid=scanner.nextInt();
			
			Set<Address>addresses=new EmployeeDaoImpl().getAddresses(cid);
			
			addresses.forEach(System.out::println);
			
		} catch (EmployeeException employeeException) {
			System.out.println(employeeException.getMessage());
		}
		
		
	}
	
}
