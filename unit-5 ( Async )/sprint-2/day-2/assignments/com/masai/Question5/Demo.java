package com.masai.Question5;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		List<Product>listOfProduct=Arrays.asList(
				
				new Product(399,"3310", 9, 5690),
				new Product(123,"iPhone 14 Pro", 2, 1000),
				new Product(987,"S20 Pro", 1, 9000),
				new Product(789,"Nord 2", 8, 8000),
				new Product(347,"6", 1, 7000)
				
				);
		
		listOfProduct
		.stream()
//		.filter(price->price)
		.forEach(System.out::println);
		
	}

}
