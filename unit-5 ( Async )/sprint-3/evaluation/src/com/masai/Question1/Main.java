package com.masai.Question1;

public class Main {

	public static void main(String[] args) {
		
		Thread thread1=new Thread(new FunA());
		Thread thread2=new Thread(new FunB());
		
		thread1.start();
		thread2.start();

	}

}
