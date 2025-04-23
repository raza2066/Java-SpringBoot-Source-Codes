package cpm.raza.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
    	EntityManager entityManager = factory.createEntityManager();
        StudentsBean student = entityManager.find(StudentsBean.class, 1);
        
        entityManager.getTransaction().begin();
        System.out.println(student);
        entityManager.getTransaction().commit();
    }
}
