package com.hcl.java8features.simpleconcepts;

interface Talkable {
	default void talk() {
		System.out.println("Talking from default method");
	}
	
	static void talking() {
		System.out.println("Talking from static method");
	}
	
	void talkfast();
}

public class StaticMethods implements Talkable {

	@Override
	public void talkfast() {
		// TODO Auto-generated method stub
		System.out.println("Talking fast from implemented method");
	}
	
	public static void main(String[] args) {
		StaticMethods s = new StaticMethods();
		
		System.out.println("Using implemented method...");
		s.talkfast();
		
		System.out.println("\nUsing static method...");
		Talkable.talking();
		
		System.out.println("\nUsing default method...");
		s.talk();
		
	}
	
	
}
