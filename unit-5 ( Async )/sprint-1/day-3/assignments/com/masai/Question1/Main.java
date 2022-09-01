package com.masai.Question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MyGeneric generic=new MyGeneric();
		List list=new ArrayList<>();
		
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter Number or String");
			Object object=scanner.next();
			list.add(object);
			System.out.println("Would you like to add anything");
			String userInput=scanner.next();
			if(userInput.equalsIgnoreCase("No")) {
				break;
			}
		}
	
		generic.add(list);
		
		System.out.println(generic.get());
	
	}

}

class MyGeneric<E>{
	List list;
	public void add(List list) {
		this.list=list;
	}
	public List get() {
		return this.list;
	}
}