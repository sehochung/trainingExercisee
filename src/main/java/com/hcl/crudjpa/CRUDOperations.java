package com.hcl.crudjpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 * JPA CRUD Operations
 * 
 * @author Ramesh Fadatare
 *
 */
public class CRUDOperations {
	public void insertEntity(String a, String b, String c) {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Student student = new Student(a, b, c);
		entityManager.persist(student);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void findEntity(int id) {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		Student student = entityManager.find(Student.class, id);
		System.out.println("student id :: " + student.getId());
		System.out.println("student firstname :: " + student.getFirstName());
		System.out.println("student lastname :: " + student.getLastName());
		System.out.println("student email :: " + student.getEmail());
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void updateEntity(String a, String b, String c, int id) {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();

		Student student = entityManager.find(Student.class, id);
		System.out.println("student id :: " + student.getId());
		System.out.println("student firstname :: " + student.getFirstName());
		System.out.println("student lastname :: " + student.getLastName());
		System.out.println("student email :: " + student.getEmail());

		// The entity object is physically updated in the database when the transaction
		// is committed
		student.setFirstName(a);
		student.setLastName(b);
		student.setEmail(c);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void removeEntity(int id) {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();

		Student student = entityManager.find(Student.class, id);
		System.out.println("student id :: " + student.getId());
		System.out.println("student firstname :: " + student.getFirstName());
		System.out.println("student lastname :: " + student.getLastName());
		System.out.println("student email :: " + student.getEmail());
		entityManager.remove(student);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}