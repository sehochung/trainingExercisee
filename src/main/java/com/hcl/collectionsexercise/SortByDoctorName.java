package com.hcl.collectionsexercise;

import java.util.Comparator;

public class SortByDoctorName implements Comparator<Doctor> {

	public int compare(Doctor a, Doctor b) {
		return a.getDoctorName().compareTo(b.getDoctorName());
	}

}
