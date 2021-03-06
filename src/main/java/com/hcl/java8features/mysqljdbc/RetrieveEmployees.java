package com.hcl.java8features.mysqljdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.hcl.java8features.Employee;

public class RetrieveEmployees {
	private static final String QUERY = "SELECT * FROM demo2.Employee";

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/demo2?allowPublicKeyRetrieval=true&useSSL=false";
		String user = "root";
		String password = "password123";

		try (Connection con = DriverManager.getConnection(url, user, password);
				PreparedStatement preparedStatement = con.prepareStatement(QUERY, Statement.RETURN_GENERATED_KEYS)) {

			ResultSet rs = preparedStatement.executeQuery();

			System.out.println("**** Original list of records ****");
			while (rs.next()) {
				int id = rs.getInt("EmpID");
				String name = rs.getString("EmpName");
				String dob = rs.getString("DOB");
				int salary = rs.getInt("Salary");
				int age = rs.getInt("Age");

				System.out.println(id + "," + name + "," + dob + "," + salary + "," + age);
			}

		}

		catch (SQLException e) {

		}

	}
}
