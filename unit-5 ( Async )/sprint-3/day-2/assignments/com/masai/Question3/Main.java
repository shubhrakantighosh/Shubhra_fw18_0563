package com.masai.Question3;

public class Main {
	
	public static void main(String[] args) {
		
		OddNumber oddNumber=new OddNumber();
		EvenNumber evenNumber=new EvenNumber();
		
		Thread threadOdd=new Thread(oddNumber);
		Thread threadEven=new Thread(evenNumber);
		
		threadOdd.setName("Odd Number is : ");
		threadEven.setName("Even Number is : ");
		
		try {
			
			threadOdd.start();
			threadOdd.join();
			threadEven.start();
			
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}
}
