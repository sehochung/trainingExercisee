package com.hcl.java8features.filteremployee;

import java.util.ArrayList;
import java.util.List;

import com.hcl.java8features.Employee;

public class NoStreamFilter {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();

		Employee e1 = new Employee(1, "Aaron", "10/10/2000", 50000, 21);
		Employee e2 = new Employee(2, "Kenny", "02/20/2000", 60000, 21);
		Employee e3 = new Employee(3, "Denis", "04/20/1999", 70000, 22);
		Employee e4 = new Employee(4, "Seho", "07/13/1995", 80000, 26);
		Employee e5 = new Employee(5, "Patrick", "07/01/1994", 85000, 27);
		Employee e6 = new Employee(6, "Brian", "07/01/1990", 85000, 31);
		Employee e7 = new Employee(7, "Daniel", "07/05/1989", 10002, 32);

		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		employeeList.add(e6);
		employeeList.add(e7);

		List<String> filteredEmployeeList = new ArrayList<String>();
		for (int i = 0; i < employeeList.size(); i++) {
			if (employeeList.get(i).Salary > 10000
					&& (employeeList.get(i).EmpName.startsWith("B") || employeeList.get(i).EmpName.startsWith("D"))
					&& employeeList.get(i).Age > 30) {
				filteredEmployeeList.add(employeeList.get(i).EmpName);
			}

		}
		System.out.println(filteredEmployeeList);
	}

}
