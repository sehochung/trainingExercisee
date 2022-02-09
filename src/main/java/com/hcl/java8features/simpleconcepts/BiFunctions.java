package com.hcl.java8features.simpleconcepts;

import java.util.function.BiFunction;

public class BiFunctions {
	public static void main(String[] args) {
		System.out.println("BiFunction to add and subtract \n");
		BiFunction<Integer, Integer, Integer> subtract = (a, b) -> a - b;
		System.out.println("Subtraction: " + subtract.apply(5, 1));
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
		System.out.println("Addition: " + add.apply(5, 1));

	}
}
