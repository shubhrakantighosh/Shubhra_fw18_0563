package com.masai.Question7;

public class Main {
	
	public static void main(String[] args) {
		Fun fun=new Fun();
		
		Thread threadDhoni=new Thread(fun);
		Thread threadKohli=new Thread(fun);
		
		threadDhoni.setName("Dhoni");
		threadKohli.setName("Kohli");
		
		threadDhoni.setPriority(8);
		threadKohli.setPriority(10);
		
		threadDhoni.start();
		threadKohli.start();
		
		Thread.currentThread().setName("Main");
		System.out.println(Thread.currentThread().getName());
		
	}

}
