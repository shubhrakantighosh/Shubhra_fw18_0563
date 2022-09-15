package com.masai.Question6;

public class CallStartMain {
	public static void main(String[] args) {
		
		ThreadA threadA=new ThreadA();
		threadA.start();
		
		for(int i=50;i<100;i++) {
			System.out.println(i);
		}
	}
}
