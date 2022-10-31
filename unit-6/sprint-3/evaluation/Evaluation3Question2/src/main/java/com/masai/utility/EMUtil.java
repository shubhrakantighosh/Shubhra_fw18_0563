package com.masai.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
	
	private static EntityManagerFactory entityManagerFactory;
	
	static {
		entityManagerFactory=Persistence.createEntityManagerFactory("StudentUnit");
	}

	public static EntityManager provideEntityManager() {
		
		return entityManagerFactory.createEntityManager();
		
	}
	
}
