package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		College college=applicationContext.getBean("college",College.class);

		college.showDetails();
		
	}

}
