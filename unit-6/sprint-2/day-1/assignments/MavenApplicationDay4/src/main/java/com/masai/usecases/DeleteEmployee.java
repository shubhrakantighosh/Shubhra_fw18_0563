package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exceptions.EmployeeException;
import com.masai.model.Employee;

public class DeleteEmployee {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		try {
			
			System.out.println("Enter Employee ID :");
			int employeeID=scanner.nextInt();
			EmployeeDao employeeDao=new EmployeeDaoImpl();

			Employee employee2= employeeDao.deleteEmployeeById(employeeID);
			
			System.out.println("Removed.");
			
		} catch (EmployeeException employeeException) {
			
			System.out.println(employeeException.getMessage());
		}
		
	}
	
}
