package com.masai.usecases;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.model.Product;
import com.masai.utility.EMUtil;

public class Main {
	
	public static void main(String[] args) {
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		Product product1=new Product("iPhone", 100, 1);
		Product product2=new Product("Samsung", 90, 2);
		Product product3=new Product("Oneplus", 70, 4);
		Product product4=new Product("Pixel", 60, 2);
		Product product5=new Product("Blackberry", 70, 7);
		
		entityManager.getTransaction().begin();
		entityManager.persist(product1);
		entityManager.persist(product2);
		entityManager.persist(product3);
		entityManager.persist(product4);
		entityManager.persist(product5);
		entityManager.getTransaction().commit();	
		
		
		
		Query query1=entityManager.createNamedQuery("product.Name&Quantity");
		List<Object[]>lists=query1.getResultList();
		
		for(Object[] object:lists) {
			System.out.println((String)object[0]+" "+(Integer)object[1]);
		}
		
		Query query2=entityManager.createNamedQuery("product.Price");
		query2.setParameter("productId", 4);
		
		System.out.println(query2.getSingleResult());
		
		TypedQuery<Product>typedQuery=entityManager.createQuery("from Product where productId=:productId",Product.class);
		typedQuery.setParameter("productId", 4);
		
		System.out.println(typedQuery.getSingleResult());
		
		
		TypedQuery<Long>typedQuery1=entityManager.createQuery("select sum(price) from Product",Long.class);
		
		System.out.println(typedQuery1.getSingleResult());
		
		
		Query query=entityManager.createQuery("from Product");
		
		List<Product>list=query.getResultList();
		
		list.forEach(System.out::println);
		
		entityManager.close();
		
		
	}
	
}
