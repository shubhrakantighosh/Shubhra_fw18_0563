package com.masai;

public class Circle implements Common{
	
	private int r;

	@Override
	public void draw() {
		System.out.println("Circle Area : "+3.14*(r*r));
		
	}

	public int getR() {
		return r;
	}


}
