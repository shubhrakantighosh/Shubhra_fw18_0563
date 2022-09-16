package com.masai.Question3;

public class EvenNumber implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				System.out.println(Thread.currentThread().getName()+i);
			}
		}
	}

}
