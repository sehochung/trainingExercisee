package com.hcl.collectionsexercise;

public class Patient {

	int patientID;
	String patientName;
	int age;

	public Patient(int a, String b, int c) {
		this.patientID = a;
		this.patientName = b;
		this.age = c;
	}

	public int getPatientID() {
		return patientID;
	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

