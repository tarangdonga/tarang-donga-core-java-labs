package com.tarang.lab5.ex2;

import java.util.Scanner;

class InvalidNameException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidNameException(String message) {
		super(message);
	}
}

class Employee {

	private String firstName;
	private String lastName;

	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void validateName() throws InvalidNameException {
		if (firstName == null || firstName.trim().isEmpty()) {
			throw new InvalidNameException("First name cannot be blank.");
		}

		if (lastName == null || lastName.trim().isEmpty()) {
			throw new InvalidNameException("Last name cannot be blank.");
		}

		System.out.println("Valid Employee Name: " + firstName + " " + lastName);
	}
}

public class NameValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter First Name: ");
		String firstName = sc.nextLine();

		System.out.print("Enter Last Name: ");
		String lastName = sc.nextLine();

		Employee emp = new Employee(firstName, lastName);

		try {
			emp.validateName();
		} catch (InvalidNameException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}
