package com.masai.Question1;

public class FunA implements Runnable{

	@Override
	public synchronized void run() {
		
		for(int i=1;i<=10;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
		
	}

}
