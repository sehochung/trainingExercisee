package com.hcl.java8features.mysqljdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEmployee {
	private static final String deleteTableSQL = "delete from employee where EmpID = ?";

	public static void main(String[] argv) throws SQLException {
		DeleteEmployee updateStatementExample = new DeleteEmployee();
		updateStatementExample.deleteRecord();
	}

	public void deleteRecord() throws SQLException {

		// Step 1: Establishing a Connection
		String url = "jdbc:mysql://localhost:3306/demo2?allowPublicKeyRetrieval=true&useSSL=false";
		String user = "root";
		String password = "password123";

		Scanner s = new Scanner(System.in);

		System.out.println("**** Delete Employee information ****");

		System.out.println("Enter Employee ID to delete: ");
		int EmpID = s.nextInt();

		try (Connection con = DriverManager.getConnection(url, user, password);
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = con.prepareStatement(deleteTableSQL)) {

			preparedStatement.setInt(1, EmpID);

			// Step 3: Execute the query or update query
			preparedStatement.execute();

		} catch (SQLException e) {

			// print SQL exception information

		}

		// Step 4: try-with-resource statement will auto close the connection.
	}
}
