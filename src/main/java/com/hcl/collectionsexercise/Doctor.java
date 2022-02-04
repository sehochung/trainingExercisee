package com.hcl.collectionsexercise;

public class Doctor {
	int doctorID;
	String doctorName;
	String speciality;

	public Doctor(int doctorID, String doctorName, String speciality) {
		this.doctorID = doctorID;
		this.doctorName = doctorName;
		this.speciality = speciality;

	}

	public int getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

}
