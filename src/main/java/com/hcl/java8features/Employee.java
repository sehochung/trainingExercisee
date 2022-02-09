package com.hcl.java8features;

public class Employee {

	// EmpID,EmpName,DOB,Salary,Age
	public int EmpID, Salary, Age;
	public String EmpName, DOB;

	public Employee(int EmpID, String EmpName, String DOB, int Salary, int Age) {

		this.EmpID = EmpID;
		this.EmpName = EmpName;
		this.DOB = DOB;
		this.Salary = Salary;
		this.Age = Age;

	}

	public int getEmpID() {
		return EmpID;
	}

	public void setEmpID(int empID) {
		EmpID = empID;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}
	

}
