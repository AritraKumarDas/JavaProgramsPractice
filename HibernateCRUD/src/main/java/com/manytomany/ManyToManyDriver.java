package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

// When adding from non-owning side, the fields has to be added from both 
// non-owning side & from the owning side of the entity class objects.
// Only adding from non-owning side will not cascade the fields in the join table. 
// Has to be added from both owning & non-owning side.

public class ManyToManyDriver {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.addAnnotatedClass(Course.class).buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Course c1 = new Course();
		c1.setCourseName("CSS");

		Student s1 = new Student();
		s1.setStudentName("Sachin");
		s1.setMarks(100.0);

		Student s2 = new Student();
		s2.setStudentName("Kumble");
		s2.setMarks(50.5);

		// adding from owning side
		List<Course> course_list = new ArrayList<Course>();
		course_list.add(c1);
		s1.setCourses(course_list);
		s2.setCourses(course_list);

		// adding from non-owning side
		List<Student> studList = new ArrayList<Student>();
		studList.add(s1);
		studList.add(s2);
		c1.setStudents(studList);

		// m2m bidirectional saving from non-owning side object
		session.saveOrUpdate(c1);

		tx.commit();

		session.close();
		factory.close();
	}

}
