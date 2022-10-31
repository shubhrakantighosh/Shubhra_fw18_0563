package com.masai.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.dao.ProductRepo;
import com.masai.exceptions.ProductException;
import com.masai.model.Product;

@Service
public class ProductServiceImpl implements ProductService{

	
	@Autowired
	private ProductRepo productRepo;
	
	@Override
	public boolean addProduct(Product product) {
		
		boolean flag=false;
		
		if(product!=null) {
			
			productRepo.insertProductDetails(product);
			flag=true;

		}
		
		return flag;
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepo.getAllProductDetails();
	}

	@Override
	public Product getProductById(int productId) throws ProductException {
		
		Product product;
		
		product=productRepo.findProduct(productId);
		
		if(product==null) {
			throw new ProductException("Not Added.");
		}
		
		return product;
		
	}

	@Override
	public List<Product> getProductsBetweenPrice(int fromPrice, int toPrice) throws ProductException {
		
		List<Product>products=new ArrayList<>();
		
		products=productRepo.getProductInPriceRange(fromPrice, toPrice);
		
		if(products==null) {
			throw new ProductException("Please Change the Price Range.");
		}
		
		return products;
	}

}
