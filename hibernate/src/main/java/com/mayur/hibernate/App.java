package com.mayur.hibernate;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;

public class App {

	public static void main(String[] args) {
 
		
	    Student student= new Student();
		
		student.setAge(21);
		
		student.setName("mayur");
		
		student.setSid(101);
		
		Configuration configuration= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session =  ( sessionFactory).openSession();
		
		Transaction transaction = session.beginTransaction();
		
		
		
		session.save(student);
		
		transaction.commit();
		
		session.close();
		
		sessionFactory.close();
		
  }

}
