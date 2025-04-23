package com.raza.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
public static void main(String[] args) {
        
        Configuration config = new Configuration().configure().addAnnotatedClass(StudentsBean.class);
        SessionFactory factory = config.buildSessionFactory();
        Session session1 = factory.openSession();
        session1.beginTransaction();

        System.out.println("***from session 1***");
        StudentsBean student = session1.get(StudentsBean.class,1);
        System.out.println(student);
        System.out.println("********************");
        
        System.out.println("***from session 1***");
        student = session1.get(StudentsBean.class,1);
        System.out.println(student);
        System.out.println("********************");
        
        session1.close();
        Session session2 = factory.openSession();
        session2.beginTransaction();
        
        System.out.println("***from session 2***");
        student = session2.get(StudentsBean.class,1);
        System.out.println(student);
        System.out.println("********************");
        
        session2.close();
	}
	
}
