package com.hcl.java8features.simpleconcepts;

import java.util.Scanner;

interface Multiply {
	int multiply(int a, int b);
}

interface LowerCase {
	String toLowerCase(String a);
}


public class LambdaExpressions {
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("****Results using Lambda Expressions****\n");
		
	
		// intialize string to lowercase
		System.out.println("Enter a word: ");
		String z = s.nextLine();
		// lambda function withh return
		LowerCase l1 = (a) -> {
			
			return a.toLowerCase();
			
		} ;
		
		System.out.println("Result: "+l1.toLowerCase(z));
		
		
		// intialize two numbers to multiply
		System.out.println("Enter two numbers (first #): ");
		int x = s.nextInt();
		System.out.println("Enter two numbers (second #): ");
		int y = s.nextInt();
		
		// lambda function for multiply
		Multiply m1 = (a, b) -> (a*b);
		// output result of lambda function
		System.out.println("Result: " + m1.multiply(x,y));
		
		
		
		
	}
}
