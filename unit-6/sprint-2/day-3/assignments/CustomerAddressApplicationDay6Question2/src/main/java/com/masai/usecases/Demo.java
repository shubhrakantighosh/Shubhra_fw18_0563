package com.masai.usecases;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.model.Customer;
import com.masai.utility.EMUtil;

public class Demo {
	public static void main(String[] args) {
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		TypedQuery<Customer>typedQuery=entityManager.createQuery("from Customer where cid=:cid", Customer.class);
		typedQuery.setParameter("cid", 1);
		
		Customer customer=typedQuery.getSingleResult();
		
		entityManager.close();
		
		System.out.println(customer.getHome());
		System.out.println(customer.getOffice());
	
	}
}
