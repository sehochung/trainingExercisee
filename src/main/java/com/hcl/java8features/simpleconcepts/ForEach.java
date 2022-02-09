package com.hcl.java8features.simpleconcepts;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		List<Integer> aList = new ArrayList<>();
		for (int j = 0; j < 10; j++) {
			aList.add(j);
		}
		
		System.out.println("Created List: "+aList);
		
		System.out.println("Using for each method to print each integer: ");
		aList.forEach(p -> System.out.println(p));
	}
}
