package com.raza.h01HibernateSessions;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Update {

	public static void main(String[] args) {
		StudentsBean student = null;
        
        
        Configuration config = new Configuration().configure().addAnnotatedClass(StudentsBean.class);
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        SessionFactory factory = config.buildSessionFactory(reg);
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        student = session.get(StudentsBean.class, 1);
        if (student != null) {
			student.setEmail("johndoe@example.com");
			
			session.merge(student);
			
		} else {
			System.out.println("Student not Found");
		}
        
        tx.commit();
	}

}
