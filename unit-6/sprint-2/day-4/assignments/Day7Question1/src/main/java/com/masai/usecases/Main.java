package com.masai.usecases;

import javax.persistence.EntityManager;

import com.masai.model.Address;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;

public class Main {
	
	public static void main(String[] args) {
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		Employee employee=new Employee();
		employee.setName("Shubhra");
		employee.setSalary(900000);
		employee.setHomeAddress(new Address("WB", "Kolkata", "700102"));
		employee.setOfficeAddress(new Address("KA","Bangalore", "765456"));
		
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		
	}
	
}
