package com.gl.departments;
import com.gl.superpackage.SuperDepartment;

// extending all the properties and functionalities of super class

public class AdminDepartment extends SuperDepartment {

	// defining all the methods of AdminDepartment class
	
	public String departmentName() {          

		return "Admin Department";
	}

	public String getTodaysWork() {

		return "Complete your documents submission";
	}

	public String getWorkDeadline() {

		return "Complete by EOD";
	}

}
