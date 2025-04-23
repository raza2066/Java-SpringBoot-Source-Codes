package com.raza.utility;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtility {
	private static EntityManagerFactory entityManagerFactory;
	
	private static EntityManagerFactory buildEntityManagerFactory() {
		
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("unit");
			return entityManagerFactory;
		} catch (Throwable e) {
			System.err.println("Initialization of Entity Manager Factory Failed\n"+e);
			throw new RuntimeException(e);
		}
	}
	
	public static EntityManagerFactory getEntityManagerFactory() {
		if(entityManagerFactory == null) {
			entityManagerFactory = buildEntityManagerFactory();
		}
		return entityManagerFactory;
	}

	public static void closeEntityManagerFactory() {
		if(entityManagerFactory!=null && entityManagerFactory.isOpen()) {
			entityManagerFactory.close();
		}
	}
}
