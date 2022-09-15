package com.masai.Question5;


class ThreadA extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
}


public class UsingThreadMain {
	
	public static void main(String[] args) {
		ThreadA threadA=new ThreadA();
		threadA.start();
	}

}
