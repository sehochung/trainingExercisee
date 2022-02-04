package com.hcl.collectionsexercise;

import java.util.Comparator;

public class SortByPatientName implements Comparator<Patient>{
	
	public int compare(Patient a, Patient b) {
		return a.getPatientName().compareTo(b.getPatientName());
	}

}
