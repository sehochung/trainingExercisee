package com.hcl.java8features.mysqljdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertRecords {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/demo2?allowPublicKeyRetrieval=true&useSSL=false";
        String user = "root";
        String password = "password123";
        String sql = "INSERT INTO Employee(EmpName, DOB, Salary, Age) VALUES(? ,? ,? ,?)";
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        String EmpName = s.nextLine();

        System.out.println("Enter Employee DOB: ");
        String DOB = s.nextLine();

        System.out.println("Enter Employee Salary: ");
        int Salary = s.nextInt();

        System.out.println("Enter Employee Age: ");
        int Age = s.nextInt();
        
        
        try (Connection con = DriverManager.getConnection(url, user, password);
                PreparedStatement preparedStatement = con.prepareStatement(sql,
                        Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, EmpName);

            preparedStatement.setString(2, DOB);

            preparedStatement.setLong(3, Salary);

            preparedStatement.setLong(4, Age);

            preparedStatement.executeUpdate();

            try (ResultSet resultSet = preparedStatement.getGeneratedKeys()) {

                if (resultSet.first()) {

                    System.out.printf("Employee created with name: %s", EmpName);
                }
            }

        } catch (SQLException ex) {

            Logger lgr = Logger.getLogger(MySqlTest.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
	}
}
