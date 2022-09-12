package com.masai.Question4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<String>names=Arrays.asList(
				"Ram","Shubhra","Chirag","Soumya","Subhadeep","Sourik","Tushar","Sanjib","Dhriti","Apurba");
		
		List<String>sortedNames=new ArrayList<>();
		
		names 
		     .stream()
		     .filter(name->name.length()%2==0)
		     .forEach(upper->sortedNames.add(upper.toUpperCase()));
		
		Stream<String>sortToOrder=sortedNames
				                  .stream()
				                  .sorted((s1,s2)->s2.compareTo(s1));

		
		System.out.println("Unsorted names :"+"\n");
		
		for(String old:sortedNames) {
			System.out.println(old);
		}
		
		System.out.println("\n"+"Sorted names :"+"\n");
		
		for(Object sortNames:sortToOrder.toArray()) {
			System.out.println(sortNames);
		}
		
			
	}
}
