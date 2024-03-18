package com.gl.departments;
import com.gl.superpackage.SuperDepartment;

//extending all the properties and functionalities of super class

public class HrDepartment extends SuperDepartment{

	// defining all the methods of HrDepartment class
	
	public String departmentName() {

		return "HR Department";
	}

	public String getTodaysWork() {

		return "Fill today’s timesheet and mark your attendance";
	}

	public String getWorkDeadline() {

		return "Complete by EOD";
	}

	public String doActivity() {

		return "team Lunch";
	}

}
