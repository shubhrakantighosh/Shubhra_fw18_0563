package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exceptions.EmployeeException;
import com.masai.model.Employee;

public class UpdateEmployee {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		try {
			
			Employee employee=new Employee();
			
			System.out.println("Enter Employee ID :");	
			employee.setEmpId(scanner.nextInt());
			
			EmployeeDao employeeDao=new EmployeeDaoImpl();
		
			employee=employeeDao.getEmployeeById(employee.getEmpId());
			
			if(employee!=null) {
				
			
				System.out.println("Enter New Employee Address :");	
				employee.setAddress(scanner.next());
			
			    employee=employeeDao.updateEmployee(employee);
			    
			    if(employee!=null) {
			    	System.out.println("Update Successfully.");
			    }
			    
			    	
			}else System.out.println("Employee ID Not Exist.");
			
		} catch (EmployeeException employeeException) {
			
			System.out.println(employeeException.getMessage());
		}
		
		
	}
}
