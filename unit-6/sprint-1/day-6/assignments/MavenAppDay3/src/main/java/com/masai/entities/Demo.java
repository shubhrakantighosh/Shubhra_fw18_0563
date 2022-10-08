package com.masai.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Demo {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("empUnit");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
//		Employee employee=entityManager.find(Employee.class, 10);
//		
//		if(employee!=null) {
//			System.out.println(employee);
//			
//		}else System.out.println("Not exit");
		
		Employee employee=new Employee(12,"Shubhra","Delhi",700);
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		
		entityManager.persist(employee);

		entityTransaction.commit();
		
		entityManager.close();
	}
}
