package com.hcl.java8features.simpleconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicates {
	public static void main(String[] args) {
		
		System.out.println("Predicate testing for 25\n");
		
		Predicate<Integer> p = x -> (x == 25);
		
		System.out.println("Testing 21: "+p.test(21));
		System.out.println("Testing 25: "+p.test(25));
	}
}
