package com.hcl.java8features.simpleconcepts;

import java.util.Optional;

public class OptionalClasses {
	public static void main(String[] args) {
		String name = null;
		String name2 = "SeHO";

		System.out.println("Optional class with null value: " + name);

		Optional<String> opt = Optional.ofNullable(name);
		if (opt.isPresent()) {
			@SuppressWarnings("null")
			String lowercaseString = name.toLowerCase();
			System.out.println(lowercaseString);
		} else
			System.out.println("String Value is Null or not present");

		
		System.out.println("Optional class with a real String value: " + name2);
		Optional<String> opt2 = Optional.ofNullable(name2);
		if (opt2.isPresent()) {
			String lowercaseString = name2.toLowerCase();
			System.out.println(lowercaseString);
		} else
			System.out.println("String Value is Null or not present");
	}

}
