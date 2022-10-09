package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDaoImpl;

public class AddressOfEmployee {
	
	public void getAddressOfEmployee() {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Employee ID : ");
		int empId=scanner.nextInt();
		
		try {
			
			String result=new EmployeeDaoImpl().getAddressOfEmployee(empId);
			
			System.out.println(result);
			
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		
	}

}
