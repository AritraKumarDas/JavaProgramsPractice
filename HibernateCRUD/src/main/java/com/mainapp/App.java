package com.mainapp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Employee;

public class App {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		Transaction tx = session.beginTransaction();

		// inserting records
//	  Employee dino = new Employee("Dino", "HR", 20000.00);
//	  Employee suraj = new Employee("Suraj", "MIS", 30000.00);
//	  session.save(suraj);
//	  session.save(dino);

		tx.commit();
		session.close();

		// getting a record
		session = factory.openSession();
		Employee tempEmp = session.get(Employee.class, 30);
		System.out.println(tempEmp);
		session.close();

		// reading data in list
		session = factory.openSession();

		List<Employee> empList = session.createQuery("from Employee", Employee.class).list();
		empList.forEach(e -> {
			System.out.println(e);
		});

		// deleting single record
		session = factory.openSession();
		tx = session.beginTransaction();
		tempEmp = session.get(Employee.class, 3);
		if (tempEmp != null) {
			session.delete(tempEmp);
			tx.commit();

		}
		session.close();

		// deleting multiple records
		session = factory.openSession();
		tx = session.beginTransaction();
		int deletedrecordNums = session.createQuery("delete from Employee where id >=4 and id <=6").executeUpdate();
		tx.commit();
		session.close();
		System.out.printf("%d records deleted\n", deletedrecordNums);

		// updating single records
		session = factory.openSession();
		tx = session.beginTransaction();
		tempEmp = session.get(Employee.class, 1);
		tempEmp.setEmpName("Aritra Kumar Das");
		session.update(tempEmp);
		tx.commit();
		session.close();
		System.out.println("Record updated");

		// updating multiple records by where condition
		session = factory.openSession();
		tx = session.beginTransaction();
		int updatedRecordsNum = session.createQuery("update Employee set salary=salary*1.10 where salary<25000")
				.executeUpdate();

		tx.commit();
		session.close();
		System.out.printf("%d Records updated\n", updatedRecordsNum);

		factory.close();

	}
}
