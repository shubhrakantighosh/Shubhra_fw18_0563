package com.masai.Question1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		
		List<Product>list=Arrays.asList(
				
				new Product(12, "iPhone 13", 12680, 12),
				new Product(11, "Samsung S20", 21680, 10),
				new Product(10, "OnePlus Nord", 9680, 7),
				new Product(15, "iPhone 12", 9710, 9),
				new Product(13, "Nokia 3310", 579, 90)
				
				);
		
		System.out.println("<<--Using Lambda-->>"+"\n");
		Stream<Product>list1=list.stream();
		Stream<Product>list2=list1.sorted((s1,s2)->s2.getPrice()>s2.getPrice()?-1:+1).filter(s->s.getQuantity()>10);
		list2.forEach(System.out::println);

				
		System.out.println("\n"+"<<--Using API Stream-->>"+"\n");
		list
		.stream()
		.sorted((s1,s2)->s1.getPrice()>s2.getPrice()?-1:+1)
		.filter(s->s.getQuantity()>10)
		.forEach(System.out::println);
		
		
	}

}
