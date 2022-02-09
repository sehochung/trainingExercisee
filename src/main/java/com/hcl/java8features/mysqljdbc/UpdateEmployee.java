package com.hcl.java8features.mysqljdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmployee {
	private static final String UPDATE_USERS_SQL = "update employee set EmpName = ?, DOB = ?, Salary = ?, Age = ? where EmpID = ?";

	public static void main(String[] argv) throws SQLException {
		UpdateEmployee updateStatementExample = new UpdateEmployee();
		updateStatementExample.updateRecord();
	}

	public void updateRecord() throws SQLException {
		System.out.println(UPDATE_USERS_SQL);
		// Step 1: Establishing a Connection
		String url = "jdbc:mysql://localhost:3306/demo2?allowPublicKeyRetrieval=true&useSSL=false";
		String user = "root";
		String password = "password123";

		Scanner s = new Scanner(System.in);

		System.out.println("**** Update Employee information ****");

		System.out.println("Enter New Employee Name: ");
		String EmpName = s.nextLine();
		System.out.println("Enter New DOB: ");
		String DOB = s.nextLine();
		System.out.println("Enter New Salary: ");
		int Salary = s.nextInt();
		System.out.println("Enter New Age: ");
		int Age = s.nextInt();

		System.out.println("Enter Employee ID to change: ");
		int EmpID = s.nextInt();

		try (Connection con = DriverManager.getConnection(url, user, password);
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = con.prepareStatement(UPDATE_USERS_SQL)) {
			preparedStatement.setString(1, EmpName);
			preparedStatement.setString(2, DOB);
			preparedStatement.setInt(3, Salary);
			preparedStatement.setInt(4, Age);
			preparedStatement.setInt(5, EmpID);

			// Step 3: Execute the query or update query
			preparedStatement.executeUpdate();

		} catch (SQLException e) {

			// print SQL exception information

		}

		// Step 4: try-with-resource statement will auto close the connection.
	}
}
