package com.masai.Question4;

public class Dhoni implements Runnable{
	
	int sum=0;
	
	@Override
	public void run() {
		for(int i=1;i<=20;i++) {
			sum+=i;
			System.out.println(sum+" "+Thread.currentThread().getName());
		}
		
	}

}
