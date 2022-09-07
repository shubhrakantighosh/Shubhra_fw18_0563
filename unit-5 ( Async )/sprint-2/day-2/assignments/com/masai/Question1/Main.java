package com.masai.Question1;

public class Main {

	public static void main(String[] args) {
		
		Animal animal=new Tiger();
		try {
			animal.eat();
			
		} catch (AnimalException e) {
			
			e.printStackTrace();
		}

	}

}
