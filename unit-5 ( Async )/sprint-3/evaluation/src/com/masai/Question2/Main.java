package com.masai.Question2;


public class Main {
	

	public static void main(String[] args) throws InterruptedException {
		
		Calculate1 calculate=new Calculate1();
		Thread thread=new Thread(calculate);
		 
		 thread.start();
		 
		 
		 Thread.currentThread().setPriority(10);
		 
		 Thread.currentThread().sleep(2000);
		 

		 System.out.println("Calculated value is "+calculate.product);

	}

}
