package com.masai;

public class Cylinder implements Common{
	
	private int h;
	private int r;

	@Override
	public void draw() {
		System.out.println("Cylinder Area : "+3.14*(r*r)*h);
		
	}

	public void setH(int h) {
		this.h = h;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	

}
