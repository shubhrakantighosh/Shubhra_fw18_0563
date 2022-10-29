package com.masai;

import java.util.Map;

public class Demo {
	
	private Map<Department, Employee> theMap;
	//use setter injection to inject theMap;
	public void myInit(){
	System.out.println("inside myInit method");
	}
	public void cleanUp(){
	System.out.println("inside cleanUp method'");
	}
	public void showDetails(){
	System.out.println("inside showDetails of Demo class");
	//print all the details of all the employees department-wise.
	}

}
