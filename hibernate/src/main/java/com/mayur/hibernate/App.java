package com.mayur.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App {

	public static void main(String[] args) {
		// Student class object and set value
		Name name = new Name();

		name.setfName("mayur");

		name.setlName("patel");

		Student student = new Student();

		student.setAge(21);

		student.setName(name);

//Laptop class object and set value 
		Laptop laptop = new Laptop();

		laptop.setlName("CHN-1");

		student.getLaptop().add(laptop);

		laptop.getStudent().add(student);

		// laptop.setStudent(student.getSid());
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

		Session session = (sessionFactory).openSession();

		Transaction transaction = session.beginTransaction();

		session.save(student);

		session.save(laptop);

		transaction.commit();

		session.close();

		sessionFactory.close();

		// System.out.println(student);
	}

}
