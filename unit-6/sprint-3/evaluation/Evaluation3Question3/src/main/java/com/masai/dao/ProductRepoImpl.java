package com.masai.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.masai.model.Product;
import com.masai.utility.EMUtil;

@Repository
public class ProductRepoImpl implements ProductRepo{

	@Override
	public boolean insertProductDetails(Product product) {
		
		boolean flag=false;
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		if(product!=null) {
			
			
			entityManager.getTransaction().begin();
			entityManager.persist(product);
			entityManager.getTransaction().commit();
			
			flag=false;
			
		}
		
		entityManager.close();
		
		return flag;
		
	}

	@Override
	public List<Product> getAllProductDetails() {
		
		List<Product>products=new ArrayList<>();
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		TypedQuery<Product>typedQuery=entityManager.createQuery("from Product",Product.class)
		
		products=typedQuery.getResultList();
		
		entityManager.close();
		
		return products;
		
	}

	@Override
	public Product findProduct(int productId) {
		
		Product product=new Product();
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		product=entityManager.find(Product.class, productId);
		
		return product;
		
		
	}

	@Override
	public List<Product> getProductInPriceRange(int fromPrice, int toPrice) {
		
		List<Product>products=new ArrayList<>();
		
		EntityManager entityManager=EMUtil.provideEntityManager();
		
		TypedQuery<Product>typedQuery=entityManager.createQuery("from Product where price>:fromPrice AND price<:toPrice",Product.class)
		typedQuery.setParameter("fromPrice",fromPrice);
		typedQuery.setParameter("toPrice",toPrice);
				
		products=typedQuery.getResultList();
		
		entityManager.close();
		
		return products;
		
		
	}

}
