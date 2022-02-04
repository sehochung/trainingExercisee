package com.hcl.collectionsexercise;

import java.util.Comparator;

public class SortByDoctorSpeciality implements Comparator<Doctor>{
	
	public int compare(Doctor a, Doctor b) {
		return a.getSpeciality().compareTo(b.getSpeciality());
	}


}
