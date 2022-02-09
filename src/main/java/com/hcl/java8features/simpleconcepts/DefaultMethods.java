package com.hcl.java8features.simpleconcepts;

interface Welcome {
	default void message() {
		System.out.println("This is a default method.");
	}

	void secondMessage(String msg);
}

public class DefaultMethods implements Welcome {

	@Override
	public void secondMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
	}

	public static void main(String[] args) {
		DefaultMethods d = new DefaultMethods();
		System.out.println("**** USING DEFAULT METHOD ****");
		d.message();

		System.out.println("**** USING INTERFACE METHOD ****");
		d.secondMessage("Welcome!");

	}

}
