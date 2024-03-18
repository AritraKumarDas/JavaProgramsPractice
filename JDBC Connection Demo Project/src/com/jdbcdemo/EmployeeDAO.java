package com.jdbcdemo;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDAO {

	String tableName="employee";
	String url = "jdbc:mysql://localhost:3306/empDB";
	String username = "root";
	String password = "12345678";
	Connection conn=null;

	public EmployeeDAO() {
		try {
			conn = DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public ArrayList<Employee> readFromTable(){

		String query = "select * from employee";

		Statement st;
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			ArrayList<Employee> list = new ArrayList<Employee>(); 
			while(rs.next()) {
				int eId = rs.getInt(1);
				String eName = rs.getString(2);
				String eDept = rs.getString(3);
				float eSal = rs.getFloat(4);

				Employee newEmp = new Employee(eId, eName, eDept, eSal);
				list.add(newEmp);

			}
			return list;

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;

	}

	public void closeConnection() {
		try {
			conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int insertData() {
		int count=0;
		Scanner scanner = new Scanner(System.in);
		try {
			
			System.out.println("Enter employee Id: ");
			int empId = scanner.nextInt();
			scanner.nextLine(); // consume newline character
			System.out.println("Enter employee Name: ");
			String empName = scanner.nextLine();
			System.out.println("Enter employee Department: ");
			String empDept = scanner.nextLine();
			System.out.println("Enter employee Salary: ");
			float empSal = scanner.nextFloat();
			
			Employee e1 = new Employee(empId,empName,empDept,empSal);

			String query = "insert into employee (empId,empName,empDept,empSal) values(?,?,?,?)";

			PreparedStatement pst = conn.prepareStatement(query);
			pst.setInt(1, e1.empId);
			pst.setString(2, e1.empName);
			pst.setString(3, e1.empDept);
			pst.setFloat(4, e1.empSal);

			count = pst.executeUpdate();

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		return count;

	}

	public int changeSalary(int id, float newSalary) {
		String query = "update employee set empSal=? where empId=?";
		int count = 0;
		try {
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setFloat(1, newSalary);
			pst.setInt(2, id);
			count = pst.executeUpdate();

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		return count;
	}

	public int deleteRecord(int id) {
		String query = "delete from employee where empId=?";
		int count=0;
		try {
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setInt(1, id);
			count = pst.executeUpdate();
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
		return count;
	}

	public int deleteAllRecords() {
		String query = "delete from employee";
		int count=0;
		try {
			PreparedStatement pst = conn.prepareStatement(query);
			count = pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return count;
	}



}
