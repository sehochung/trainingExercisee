package com.hcl.collectionsexercise;

import java.util.Comparator;

public class SortByPatientAge implements Comparator<Patient> {
	
	public int compare(Patient a, Patient b) {
		return a.getAge() - (b.getAge());
	}

}
