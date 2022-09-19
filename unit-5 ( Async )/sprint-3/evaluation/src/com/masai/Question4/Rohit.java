package com.masai.Question4;

public class Rohit implements Runnable{

	int product=1;
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			product*=i;
			System.out.println(i+" "+Thread.currentThread().getName());
		}
		
	}

}
