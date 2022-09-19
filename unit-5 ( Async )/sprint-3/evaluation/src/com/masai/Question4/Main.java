package com.masai.Question4;

public class Main {

	public static void main(String[] args) {
		
		Dhoni dhoni=new Dhoni();
		Kohli kohli=new Kohli();
		Rohit rohit=new Rohit();
		
		Thread threadDhoni=new Thread(dhoni);
		Thread threadKohli=new Thread(kohli);
		Thread threadRohit=new Thread(rohit);
		
		threadDhoni.setName("Dhoni");
		threadKohli.setName("Kohli");
		threadRohit.setName("Rohit");
		
		threadDhoni.setPriority(10);
		
		threadDhoni.start();
		
		try {
			
			threadDhoni.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		threadKohli.start();
		
		try {
			
			threadKohli.join();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		threadRohit.start();

	}

}
