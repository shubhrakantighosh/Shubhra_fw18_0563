package com.masai.Question6;

class ThreadA extends Thread{
	@Override
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println(i);
		}
	}
}
