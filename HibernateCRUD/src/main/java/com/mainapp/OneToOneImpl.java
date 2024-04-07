package com.mainapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Address;
import com.entities.Employee;

public class OneToOneImpl {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.addAnnotatedClass(Address.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

//		Transaction tx = session.beginTransaction();
//		Address addr = new Address();
//		addr.setCity("Sodepur");
//		Employee aritra = new Employee("Aritra", "WebDev", 15000.00);
//		aritra.setAddress(addr);
//		session.save(addr);
//		session.save(aritra);
//		tx.commit();

//		Transaction tx = session.beginTransaction();
//		Address addr = new Address();
//		addr.setCity("Kamarhati");
//		Employee rahul = new Employee("Rahul", "MIS", 25000.00);
//		rahul.setAddress(addr);
//		session.save(addr);
//		session.save(rahul);
//		tx.commit();

//		Transaction tx = session.beginTransaction();
//		Employee emp = session.get(Employee.class, 2);
//		System.out.println(emp);
//		tx.commit();

		Transaction tx = session.beginTransaction();
		Address address1 = session.get(Address.class, 2);
		System.out.println(address1);
		tx.commit();

		session.close();
	}

}
