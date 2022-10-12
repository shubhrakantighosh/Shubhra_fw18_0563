package com.masai.usecases;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;

import com.masai.dao.EmployeeDaoImpl;
import com.masai.dao.exceptions.EmployeeException;
import com.masai.model.Address;
import com.masai.model.Employee;
import com.masai.utility.EMUtil;

public class Main {
	public static void main(String[] args) throws EmployeeException {
		
;
//		
		Address address1=new Address("West Bengal", "Kolkata", "700102", "Home");
		Address address2=new Address("Punjab", "Chandhighar", "400102", "Office");

//		
//		Employee employee=new Employee(101, "Shubhra", "7044076", "a@h.com",list);
//		
//		EntityManager entityManager=EMUtil.provideEntityManager();
//		
//		entityManager.getTransaction().begin();
//		entityManager.persist(employee);
//		entityManager.getTransaction().commit();
//		
//		entityManager.close();
//		
//		System.out.println(employee);
		
//EntityManager em= EMUtil.provideEntityManager();
//		
//		
		Employee emp= new Employee();
//		emp.setName("Ramesh");
//		emp.getAddresses().add(address1);
//		emp.getAddresses().add(address2);
//		emp.getAddresses().add(new Address("Mh", "Pune", "787887","home"));
//		emp.getAddresses().add(new Address("MP", "Indore", "584542","office"));
//		
//		
//		em.getTransaction().begin();
//		
//		em.persist(emp);
//		
//		em.getTransaction().commit();
//		
//		System.out.println("done...");
		
//		emp.setCid(1);
		new EmployeeDaoImpl().addresses(emp);
		
		
	}
}
