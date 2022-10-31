package com.masai;

public class Triangle implements Common{

	private int b;
	private int h;
	
	@Override
	public void draw() {
		System.out.println("Triangle Area : "+(b*h/2));
		
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setH(int h) {
		this.h = h;
	}
	
	

}
