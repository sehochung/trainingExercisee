package com.hcl.collectionsexercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Testing {
	public static void main(String[] args) {
		
		/*
		 * Patient Class
		 */
		List<Patient> plist = new ArrayList<Patient>();

		plist.add(new Patient(0, "seho", 22));
		plist.add(new Patient(22, "brian", 2));
		plist.add(new Patient(3, "ashley", 232));
		plist.add(new Patient(1, "zin", 1));
		
		/*
		 *  sort by patient id
		 */
		System.out.println("Before sorting...");
		for (Patient temp : plist)
			System.out.println(temp.getPatientID());
		System.out.println("After sorting...");
		Collections.sort(plist, new SortByPatientID());
		for (Patient temp : plist)
			System.out.println(temp.getPatientID());
		
		/*
		 *  sort by name
		 */
		System.out.println("Before sorting...");
		for (Patient temp : plist)
			System.out.println(temp.getPatientName());
		System.out.println("After sorting...");
		Collections.sort(plist, new SortByPatientName());
		for (Patient temp : plist)
			System.out.println(temp.getPatientName());
		
		
		/*
		 *  sort by age
		 */
		System.out.println("Before sorting...");
		for (Patient temp : plist)
			System.out.println(temp.getAge());
		System.out.println("After sorting...");
		Collections.sort(plist, new SortByPatientAge());
		for (Patient temp : plist)
			System.out.println(temp.getAge());
		
		
		/*
		 * Doctor class
		 */
		List<Doctor> dlist = new ArrayList<Doctor>();

		dlist.add(new Doctor(0, "seho", "Surgeon"));
		dlist.add(new Doctor(22, "brian", "Flu"));
		dlist.add(new Doctor(3, "ashley", "Cancer"));
		dlist.add(new Doctor(1, "zin", "Skin"));
		
		/*
		 *  sort by doctor id
		 */
		System.out.println("Before sorting...");
		for (Doctor temp : dlist)
			System.out.println(temp.getDoctorID());
		System.out.println("After sorting...");
		Collections.sort(dlist, new SortByDoctorID());
		for (Doctor temp :dlist)
			System.out.println(temp.getDoctorID());
		
		/*
		 *  sort by doctor name
		 */
		System.out.println("Before sorting...");
		for (Doctor temp :dlist)
			System.out.println(temp.getDoctorName());
		System.out.println("After sorting...");
		Collections.sort(dlist, new SortByDoctorName());
		for (Doctor temp :dlist)
			System.out.println(temp.getDoctorName());
		
		
		/*
		 *  sort by speciality
		 */
		System.out.println("Before sorting...");
		for (Doctor temp :dlist)
			System.out.println(temp.getSpeciality());
		System.out.println("After sorting...");
		Collections.sort(dlist, new SortByDoctorSpeciality());
		for (Doctor temp :dlist)
			System.out.println(temp.getSpeciality());
		
		
		
		
	}
}
