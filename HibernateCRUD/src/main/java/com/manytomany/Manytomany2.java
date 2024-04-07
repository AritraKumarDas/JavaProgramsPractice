package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

// When adding from owning side, the fields has to be added from the owning side entity class object.
// It does not matter if fields are also set from non-owning side. 
// But it is enough to add from owning side.

public class Manytomany2 {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.addAnnotatedClass(Course.class).buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Student s1 = new Student();
		s1.setStudentName("Aritra");
		s1.setMarks(75.9);

		Course c1 = new Course();
		Course c2 = new Course();

		c1.setCourseName("JavaScript");

		c2.setCourseName("Python");

		// Adding from owning side object
		List<Course> courseList = new ArrayList<Course>();
		courseList.add(c1);
		courseList.add(c2);
		s1.setCourses(courseList);

		// m2m bidirectional saving from owning side object
		session.saveOrUpdate(s1);

		tx.commit();

		session.close();
		factory.close();
	}

}
