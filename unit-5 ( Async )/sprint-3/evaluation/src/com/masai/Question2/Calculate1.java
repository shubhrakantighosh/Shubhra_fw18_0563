package com.masai.Question2;

public class Calculate1 implements Runnable{

	int product=1;
	
	@Override
	public void run() {
		
		for(int i=1;i<=10;i++) {
			product*=i;
		}
		
	}
	
}
