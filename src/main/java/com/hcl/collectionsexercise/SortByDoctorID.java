package com.hcl.collectionsexercise;

import java.util.Comparator;

public class SortByDoctorID implements Comparator<Doctor>{
	
	public int compare(Doctor a, Doctor b) {
		return a.getDoctorID() - (b.getDoctorID());
	}

}
