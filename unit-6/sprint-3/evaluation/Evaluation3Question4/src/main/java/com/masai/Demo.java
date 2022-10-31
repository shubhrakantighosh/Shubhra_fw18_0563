package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Drawshapes circle=applicationContext.getBean("dra",Drawshapes.class);
		circle.show();
		
		((ClassPathXmlApplicationContext)applicationContext).close();
		
	}

}
