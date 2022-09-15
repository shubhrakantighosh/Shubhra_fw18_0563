package com.masai.Question1;


class ThreadA extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println(i);
		}
	}
	
}


public class Demo {
	public static void main(String[] args) {
		
		ThreadA threadA=new ThreadA();
		threadA.start();
		
		
		for(int i=50;i<100;i++) {
			System.out.println(i);
		}
	}
}
