package com.masai;

import java.util.Map.Entry;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	private Map<Department, Employee> theMap;
	
	@Override
	public int hashCode() {
		return Objects.hash(theMap);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Demo other = (Demo) obj;
		return Objects.equals(theMap, other.theMap);
	}


	public void myInit(){
		
		System.out.println("inside myInit method");
		
	}
	
	
	public void cleanUp(){
		
		System.out.println("inside cleanUp method");
		theMap=null;
	}
	
	
	public void showDetails(){
		
		System.out.println("inside showDetails of Demo class");
		
		Set<Entry<Department, Employee>> set=theMap.entrySet();
		
		for(Map.Entry<Department, Employee>entry:set) {
			System.out.println(entry);
		}
		
	}


	public void setTheMap(Map<Department, Employee> theMap) {
		this.theMap = theMap;
	}
	
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Demo demo1=applicationContext.getBean("demo1", Demo.class);
		demo1.myInit();
		demo1.showDetails();
		demo1.cleanUp();
		
		
	}
	

}
