package com.masai.presentations;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.masai.exceptions.ProductException;
import com.masai.model.Product;
import com.masai.service.ProductService;

@Controller
public class Presentation {
	
	@Autowired
	private ProductService pService;
	
	
	public void insertProduct(){
		
		Scanner scanner=new Scanner(System.in);
		
		Product product=new Product();
		
		System.out.println("Enter Product Name : ");
		product.setProductName(scanner.next());
		
		System.out.println("Enter Product Quantity : ");
		product.setQuantity(scanner.nextInt());
		
		System.out.println("Enter Product Price : ");
		product.setPrice(scanner.nextInt());
	

		if(pService.addProduct(product)) {
			System.out.println("Added.");
			
		}else System.out.println("Not Added.");
		
	}
	
	
	public void printAllProduct(){
		
		List<Product>products=pService.getAllProducts();
		
		products.forEach(System.out::println);
	
	}
	
	
	public void searchProduct(){
		
		Scanner scanner=new Scanner(System.in);

		System.out.println("Enter Product ID : ");
		try {
			
			Product product=pService.getProductById(scanner.nextInt());
			System.out.println(product);
			
		} catch (ProductException e) {
			e.printStackTrace();
		}
	
	}
	
	
	public void GetProductsWithingPriceRange(){
		
		Scanner scanner=new Scanner(System.in);

		
		System.out.println("Enter Product Start Range : ");
		int productStart=scanner.nextInt();
		
		System.out.println("Enter Product End Range : ");
		int productEnd=scanner.nextInt();
		
		
		try {
			
			List<Product>products=pService.getProductsBetweenPrice(productStart, productEnd);
			products.forEach(System.out::println);
			
		} catch (ProductException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter 1 for Add Product.");
			System.out.println("Enter 2 Get All The Products.");
			System.out.println("Enter 3 Search Product.");
			System.out.println("Enter 4 Product from Price Range.");
			
			int n=scanner.nextInt();
			
			if(n==1) {
				new Presentation().insertProduct();
			}else if(n==2) {
				new Presentation().printAllProduct();
			}else if(n==3) {
				new Presentation().searchProduct();
			}else if(n==4) {
				new Presentation().GetProductsWithingPriceRange();
				
			}else System.out.println("Wrong Input.");
			
			System.out.println("To Exit Enter YES.");
			String s=scanner.next();
			if(s.equalsIgnoreCase("Yes")) {
				break;
			}
			
		}
		
	}
	
}
