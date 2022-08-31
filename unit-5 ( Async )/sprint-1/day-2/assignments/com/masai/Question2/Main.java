package com.masai.Question2;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Queue<Product> queue=new PriorityQueue<>(new SortProductPriceDescendingOrder());
		
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter Product ID");
			int productId=scanner.nextInt();
			System.out.println("Enter Product Name");
			String productName=scanner.next();
			System.out.println("Enter Product Price");
			int productPrice=scanner.nextInt();
			
			queue.add(new Product(productId, productName, productPrice));
			
			System.out.println("Product Added");
			
			System.out.println("Would you like to add more products");
			String userInput=scanner.next();
			
			if(userInput.equalsIgnoreCase("No")) {
				break;
			}
			
		}
		
		Product product;
		
		while((product=queue.poll())!=null) {
			System.out.println(product);
		}

	}

}
