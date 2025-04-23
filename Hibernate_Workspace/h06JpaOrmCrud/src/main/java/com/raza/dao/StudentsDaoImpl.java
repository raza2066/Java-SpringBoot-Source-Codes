package com.raza.dao;

import com.raza.bean.StudentsBean;
import com.raza.entity.StudentsEntity;
import com.raza.utility.JPAUtility;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class StudentsDaoImpl implements StudentsDao{

	@Override
	public int addnewStudent(StudentsBean studentsBean) throws Exception {
		int id = 0;
		
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();
			
			StudentsEntity studentsEntity = new StudentsEntity();
			studentsEntity.setFirstName(studentsBean.getFirstName());
			studentsEntity.setLastName(studentsBean.getLastName());
			studentsEntity.setDob(studentsBean.getDob());
			studentsEntity.setEmail(studentsBean.getEmail());
			studentsEntity.setEnrollmentDate(studentsBean.getEnrollmentDate());
			
			entityManager.persist(studentsEntity);
			entityManager.getTransaction().commit();
			
			id = studentsEntity.getId();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			if(entityManager!=null) {
				entityManager.close();
			}
		}
		
		return id;
	}

	@Override
	public StudentsBean findStudentById(int id) throws Exception {
		StudentsBean student = null;
		
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			
			StudentsEntity studentsEntity =  entityManager.find(StudentsEntity.class, id);
			
			if(studentsEntity != null) {
				
				student = new StudentsBean();
				student.setId(studentsEntity.getId());
				student.setFirstName(studentsEntity.getFirstName());
				student.setLastName(studentsEntity.getLastName());
				student.setDob(studentsEntity.getDob());
				student.setEmail(studentsEntity.getEmail());
				student.setEnrollmentDate(studentsEntity.getEnrollmentDate());
			}

		} catch (Exception e) {
			System.out.println(e);
		}finally {
			if(entityManager!=null) {
				entityManager.close();
			}
		}
		
		return student;
	}

	@Override
	public StudentsBean updateStudentbyId(StudentsBean studentsBean) throws Exception {
		StudentsBean student = null;
		
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			
			StudentsEntity studentsEntity =  entityManager.find(StudentsEntity.class, studentsBean.getId());
			
			if(studentsEntity != null) {
				entityManager.getTransaction().begin();
				studentsEntity.setFirstName(studentsBean.getFirstName());
				entityManager.getTransaction().commit();
				
				
				student = new StudentsBean();
				student.setId(studentsEntity.getId());
				student.setFirstName(studentsEntity.getFirstName());
				student.setLastName(studentsEntity.getLastName());
				student.setDob(studentsEntity.getDob());
				student.setEmail(studentsEntity.getEmail());
				student.setEnrollmentDate(studentsEntity.getEnrollmentDate());
			}

		} catch (Exception e) {
			System.out.println(e);
		}finally {
			if(entityManager!=null) {
				entityManager.close();
			}
		}
		
		return student;
	}

	@Override
	public StudentsBean deleteStudentById(int id) throws Exception {
		StudentsBean student = null;
		
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = JPAUtility.getEntityManagerFactory();
			entityManager = entityManagerFactory.createEntityManager();
			
			StudentsEntity studentsEntity =  entityManager.find(StudentsEntity.class, id);
			
			if(studentsEntity != null) {
				entityManager.getTransaction().begin();
				entityManager.remove(studentsEntity);
				entityManager.getTransaction().commit();
				
				student = new StudentsBean();
				student.setId(studentsEntity.getId());
				student.setFirstName(studentsEntity.getFirstName());
				student.setLastName(studentsEntity.getLastName());
				student.setDob(studentsEntity.getDob());
				student.setEmail(studentsEntity.getEmail());
				student.setEnrollmentDate(studentsEntity.getEnrollmentDate());
			}

		} catch (Exception e) {
			System.out.println(e);
		}finally {
			if(entityManager!=null) {
				entityManager.close();
			}
		}
		
		return student;
	}

}
