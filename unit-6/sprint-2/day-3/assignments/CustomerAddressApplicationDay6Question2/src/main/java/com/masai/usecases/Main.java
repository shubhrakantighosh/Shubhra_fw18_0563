package com.masai.usecases;

import javax.persistence.EntityManager;

import com.masai.model.Address;
import com.masai.model.Customer;
import com.masai.utility.EMUtil;

public class Main {
	
	public static void main(String[] args) {
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		Customer customer1=new Customer();
		customer1.setName("Shubhra");
		customer1.setMobileNumber("8765");
		customer1.setEmail("shubhra@gmail.com");
		customer1.setHome(new Address("WB", "Katwa", "71310"));
		customer1.setOffice(new Address("WB", "Kolkata", "700102"));
		
		Customer customer2=new Customer();
		customer2.setName("Soumya");
		customer2.setMobileNumber("456");
		customer2.setEmail("soumya@gmail.com");
		customer2.setHome(new Address("MH", "Pune", "440001"));
		customer2.setOffice(new Address("DL", "New Delhi", "110001"));
		

		
		entityManager.getTransaction().begin();
		entityManager.persist(customer1);
		entityManager.persist(customer2);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		
	}

}
