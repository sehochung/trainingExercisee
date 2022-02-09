package com.hcl.java8features.simpleconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.hcl.java8features.Employee;

public class CollectorsClass {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();

		Employee e1 = new Employee(1, "Aaron", "10/10/2000", 50000, 21);
		Employee e2 = new Employee(2, "Kenny", "02/20/2000", 60000, 21);
		Employee e3 = new Employee(3, "Denis", "04/20/1999", 70000, 22);
		Employee e4 = new Employee(4, "Seho", "07/13/1995", 80000, 26);

		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		
	     // Accumulate names into a List
	     List<String> list = employeeList.stream().map(Employee::getEmpName).collect(Collectors.toList());
	     
	     System.out.println("Employee Names: "+list);
	     // Convert elements to strings and concatenate them, separated by commas
	     String joined = employeeList.stream()
	                           .map(Employee::getEmpName)
	                           .collect(Collectors.joining(", "));
	     
	     System.out.println("Employee Names in one String joined by ',' : "+joined);
	     // Compute sum of salaries of employee
	     int total = employeeList.stream()
	                          .collect(Collectors.summingInt(Employee::getSalary));
	     System.out.println("Total salary of all employees: "+total);

	}
	
}
