package com.gl.main;

import com.gl.departments.AdminDepartment;
import com.gl.departments.HrDepartment;
import com.gl.departments.TechDepartment;

// **** Driver class Main ****

public class Main {

	public static void main(String[] args) {

		AdminDepartment admin = new AdminDepartment();			// AdminDepartment class instance created.

		HrDepartment hrd = new HrDepartment();					// HrDepartment class instance created.

		TechDepartment tech = new TechDepartment();	            // TechDepartment class instance created.


		/* displaying all the functionalities of AdminDepartment
		using the 'admin' instance of AdminDepartment class */

		System.out.println("Welcome to " + admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());    


		/* displaying all the functionalities of HrDepartment
		using the 'hrd' instance of HrDepartment class */

		System.out.println("\nWelcome to " + hrd.departmentName());
		System.out.println(hrd.doActivity());
		System.out.println(hrd.getTodaysWork());
		System.out.println(hrd.getWorkDeadline());
		System.out.println(hrd.isTodayAHoliday());

		/* displaying all the functionalities of TechDepartment
		using the 'tech' instance of TechDepartment class */

		System.out.println("\nWelcome to " + tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());

	}

}
