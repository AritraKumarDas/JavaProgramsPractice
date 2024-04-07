package com.person;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersistenceDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Person.class)
				.buildSessionFactory();

//		Person p1 = new Person(1, "Eddard Stark", "Winterfell");

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Person eddStark = session.get(Person.class, 1);

		eddStark.setPersonCity("King's Landing");

//		session.update(eddStark);

//		tx.commit(); 

		session.close();

		factory.close();

	}

}
