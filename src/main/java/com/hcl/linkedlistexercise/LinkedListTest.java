package com.hcl.linkedlistexercise;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	
	public static void main(String args[]) {
	    LinkedList<String> cars = new LinkedList<>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    cars.removeLast();
	    System.out.println(cars);
	    
	    cars.removeFirst();
	    System.out.println(cars);
	    
	    cars.addFirst("BENZ");
	    System.out.println(cars);
	    
	    cars.addLast("Bently");
	    System.out.println(cars);
	    
	    System.out.println("Get first element of list");
	    System.out.println(cars.getFirst());
	    
	    System.out.println("Get last element of list");
	  	System.out.println(cars.getLast());
	}

}
