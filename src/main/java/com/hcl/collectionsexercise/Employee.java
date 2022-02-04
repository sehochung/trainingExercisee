package com.hcl.collectionsexercise;

public class Employee {
	
	int id;
	String name;
	String city;
	
	
	public Employee(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
		
		System.out.println("Created Account with details:\nid = " + this.id + ", name = " + this.name + ", city = " + this.city);
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
	

}
