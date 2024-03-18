package com.gl.departments;
import com.gl.superpackage.SuperDepartment;

//extending all the properties and functionalities of super class

public class TechDepartment extends SuperDepartment{

	// defining all the methods of TechDepartment class
	
	public String departmentName() {

		return "Tech Department";
	}

	public String getTodaysWork() {

		return "Complete coding of Module 1";
	}
	
	public String getWorkDeadline() {

		return "Complete by EOD";
	}
	
	public String getTechStackInformation() {

		return "Core Java";
	}

}
