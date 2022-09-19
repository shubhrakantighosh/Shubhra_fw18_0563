package com.masai.Question4;

public class Kohli implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
		
	}

}
