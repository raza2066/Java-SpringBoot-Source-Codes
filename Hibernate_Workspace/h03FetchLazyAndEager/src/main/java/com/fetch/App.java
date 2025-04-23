package com.fetch;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
        
        Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Laptop.class);
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Employee employee = session.get(Employee.class,1);
        
        tx.commit();
        System.out.println(employee.getName());
        
        //Since the fetch type is eager the querry will be fired for laptop also with a left join.
        //By default the fetch type is lazy and wont fire querry for laptop;
	}

}

