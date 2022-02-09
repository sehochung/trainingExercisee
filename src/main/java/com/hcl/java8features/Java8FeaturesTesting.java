package com.hcl.java8features;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Java8FeaturesTesting {

	/*
	 
	
	1.Implement at least 1 program for each concept:
	
	  Lambda expressions,
	  Method references,
	  Functional interfaces,
	  Stream API,Parallel Stream,
	  Default methods,
	  Static methods in interface,
	  Optional class,
	  Collectors class,
	  ForEach() method,
	  Predicate
	  BiFunction examples

	2.Implement a Java program with Stream API and without the Stream API, 
	  consider filter condition:
	  
	  for example you had employee list filter the employee records whose 
	  salary >1000 $ ,Name Starts with B & D and age > 30 .

	  Your Java programs should be like as a Menu Driven Programs ,maven based use My SQL database.
	  In the Employee table empId field should be incremented automatically

	3. Write a Employee Management application to do the given below operations. 
  	   
  	   Assume Employee has attributes as 
  	   EmpID,EmpName,DOB,Salary,Age:
	
		1.To Insert the record in Employee DB input through command line arguments.
		2.To retrieve all the Employee information.
		3.To retrieve any employee record input given through command line arguments.
		4.To update any particular employee record  input given through command line arguments.
		5.To delete any particular employee record  input given through command line arguments.
		6.Lets say you retrieve all the employee information then you need to filter the records by the condition 
		  sal>5000 and employee name starts with B and age >21

		after implementation of these menus driven program, you can further improve the program with the help of stream ,lambda expression and functional interface.
		Use maven project, proper java coding convention ,exception handling wherever you feel you can use Java 8 also.
	
	
	*/

	
	public static void main(String[] args) {
		// jdbc:h2:~/test
		Connection conn = null;
		try {
		    conn =
		       DriverManager.getConnection("jdbc:mysql://localhost/test?" +
		                                   "user=minty&password=greatsqldb");

		    // Do something with the Connection

		   
		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		}
	}

}
