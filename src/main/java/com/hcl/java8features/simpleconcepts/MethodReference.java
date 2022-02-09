package com.hcl.java8features.simpleconcepts;

import java.util.Scanner;

/*	  Lambda expressions,
Method references,
Functional interfaces,
Stream API,Parallel Stream,
Default methods,
Static methods in interface,
Optional class,
Collectors class,
ForEach() method,
Predicate
BiFunction examples
*/

interface MathOperations {
	void start();
}

public class MethodReference {
	public static void startApp() {
		System.out.println("Starting Application...");
	}

	private int apply(int a, int b, FunctionalInterfaces c) {
		return c.apply(a, b);

	}

	static MethodReference obj = new MethodReference();

	public static void main(String[] args) {

		// method reference
		MathOperations op = MethodReference::startApp;
		op.start();

		// different operations using same functional interface
		FunctionalInterfaces addition = (int a, int b) -> a + b;
		FunctionalInterfaces subtraction = (a, b) -> a - b;
		FunctionalInterfaces multiply = (int a, int b) -> a * b;
		FunctionalInterfaces division = (int a, int b) -> a / b;
		FunctionalInterfaces modulo = (int a, int b) -> a % b;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int a = s.nextInt();
		System.out.println("Enter second number: ");
		int b = s.nextInt();

		int temp = obj.apply(a, b, addition);
		System.out.println("Addition Result: " + temp);
		temp = obj.apply(a, b, subtraction);
		System.out.println("Subtraction Result: " + temp);
		temp = obj.apply(a, b, multiply);
		System.out.println("Multiply Result: " + temp);
		temp = obj.apply(a, b, division);
		System.out.println("Division Result: " + temp);
		temp = obj.apply(a, b, modulo);
		System.out.println("Modulo Result: " + temp);

	}
}
