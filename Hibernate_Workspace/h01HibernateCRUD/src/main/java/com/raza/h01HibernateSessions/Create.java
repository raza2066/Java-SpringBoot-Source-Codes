package com.raza.h01HibernateSessions;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class Create 
{
    public static void main( String[] args )
    {
        NameBean name = new NameBean();
        name.setFirstName("Obito");
        name.setLastName("Uchiha");
        
        
        StudentsBean student = new StudentsBean();
        student.setId(8);
        student.setName(name);
        student.setDob(Date.valueOf("1998-08-20"));
        student.setEmail("hackeruchiha@notkonoha.com");
        student.setEnrollmentDate(Date.valueOf("2015-08-20"));
        
        Configuration config = new Configuration().configure().addAnnotatedClass(StudentsBean.class);
        
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        SessionFactory factory = config.buildSessionFactory(reg);
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(student);
        tx.commit();
        
    }
}
