package com.hcl.collectionsexercise;

import java.util.Comparator;

public class SortByPatientID implements Comparator<Patient> {

	public int compare(Patient a, Patient b) {
		return a.getPatientID() - (b.getPatientID());
	}

}
