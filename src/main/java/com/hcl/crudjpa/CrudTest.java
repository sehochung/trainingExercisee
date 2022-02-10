package com.hcl.crudjpa;

import java.util.Scanner;

public class CrudTest {
	public static void main(String[] args) {
		CRUDOperations crudOperations = new CRUDOperations();

		String firstName;
		String lastName;
		String email;
		int id;
		int option;

		Boolean isRunning = true;

		Scanner s = new Scanner(System.in);

		/*
		 * 1. Insert record for student 2. Find a student by id 3. Update record for
		 * student by id 4. remove student record by id 5. quit
		 * 
		 */
		while (isRunning) {

			System.out.println("***** Program Options *****");
			System.out.println("***** 1. Insert record for student *****");
			System.out.println("***** 2. Find a student by id *****");
			System.out.println("***** 3. Update record for student by id *****");
			System.out.println("***** 4. remove student record by id *****");
			System.out.println("***** 5. quit *****");

			option = Integer.valueOf(s.nextLine());

			switch (option) {

			case 1:
				System.out.println("***** Enter student first name: ");
				firstName = s.nextLine();
				System.out.println("***** Enter student last name: ");
				lastName = s.nextLine();
				System.out.println("***** Enter student email: ");
				email = s.nextLine();

				crudOperations.insertEntity(firstName, lastName, email);
				break;
			case 2:
				System.out.println("***** Enter student id: ");
				id = Integer.valueOf(s.nextLine());

				crudOperations.findEntity(id);
				break;
			case 3:
				System.out.println("***** Enter student first name: ");
				firstName = s.nextLine();
				System.out.println("***** Enter student last name: ");
				lastName = s.nextLine();
				System.out.println("***** Enter student email: ");
				email = s.nextLine();
				System.out.println("***** Enter student id: ");
				id = Integer.valueOf(s.nextLine());

				crudOperations.updateEntity(firstName, lastName, email, id);
				break;
			case 4:
				System.out.println("***** Enter student id: ");
				id = Integer.valueOf(s.nextLine());
				crudOperations.removeEntity(id);
				break;
			case 5:
				System.out.println("***** ... Program is exiting ... *****");
				isRunning = false;
			default:
				break;

			}

		}

	}
}
