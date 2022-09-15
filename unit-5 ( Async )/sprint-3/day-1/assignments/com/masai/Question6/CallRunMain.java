package com.masai.Question6;


public class CallRunMain {
	public static void main(String[] args) {
		
		ThreadA threadA=new ThreadA();
		threadA.run();
		
		for(int i=50;i<100;i++) {
			System.out.println(i);
		}
	}
}
