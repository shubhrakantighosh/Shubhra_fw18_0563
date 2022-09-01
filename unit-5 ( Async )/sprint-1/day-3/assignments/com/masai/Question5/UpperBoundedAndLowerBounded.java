package com.masai.Question5;

import java.util.Arrays;
import java.util.List;

public class UpperBoundedAndLowerBounded {
	
	public static void upperBounded(List <? extends Number>list) {
		System.out.println("<<<<-Upper Bounded->>>>");
		
		for(Number number:list){
			System.out.println(number);
		}
	}
	
	public static void lowerBounded(List <? super Integer> list) {
		System.out.println("<<<<-Lower Bounded->>>>");
		
		for(Object object:list) {
			System.out.println(object);
		}
	}
	
	
	public static void main(String[] args) {
		
		List<Integer>list1=Arrays.asList(1,2,3,4);
		List<Double>list2=Arrays.asList(1.0,2.0,3.0,4.0);
		List<Number>list3=Arrays.asList(1,2,3,4,5);
		List<Object>list4=Arrays.asList(1,2,3,4,5);
		
		upperBounded(list1);
		upperBounded(list2);
		upperBounded(list2);
		
		lowerBounded(list3);
		lowerBounded(list4);
	}
}
