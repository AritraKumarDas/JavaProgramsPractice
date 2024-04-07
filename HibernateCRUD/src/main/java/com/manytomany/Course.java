package com.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String courseName;

//	@ManyToMany(mappedBy = "courses", cascade = { CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE,
//			CascadeType.PERSIST })

	@ManyToMany(mappedBy = "courses", cascade = CascadeType.ALL)
	private List<Student> students;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(String courseName) {
		super();
//		this.id = id;
		this.courseName = courseName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + " ]";
	}

}
