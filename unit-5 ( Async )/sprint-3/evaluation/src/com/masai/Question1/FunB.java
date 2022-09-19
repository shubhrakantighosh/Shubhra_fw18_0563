package com.masai.Question1;

public class FunB implements Runnable{

	@Override
	public synchronized void run() {
		
		for(int i=10;i<=20;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
		
	}

}
