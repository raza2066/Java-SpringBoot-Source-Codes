package onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App {

	public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setLid(04);
        laptop.setLname("Macbook");
        
        Employee employee = new Employee();
        employee.setEid(04);
        employee.setName("Hasan Abbas");
        employee.setRole("App developer");
        
        employee.getLaptop().add(laptop);
        laptop.setEmployee(employee);
        
        
        
        Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Laptop.class);
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        SessionFactory factory = config.buildSessionFactory(reg);
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        session.persist(employee);
        session.persist(laptop);
        
        tx.commit();
        System.out.println();
	}

}
