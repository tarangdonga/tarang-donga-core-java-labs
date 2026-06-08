package com.tarang.lab5.ex1;

import java.util.Scanner;

class InvalidAgeException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String message) {
		super(message);
	}
}

public class AgeValidation {
	public static void validateAge(int age) throws InvalidAgeException {
		if (age <= 15) {
			throw new InvalidAgeException("Invalid Age: Age must be greater than 15.");
		} else {
			System.out.println("Valid Age: Access Granted.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter age: ");
		int age = sc.nextInt();

		try {
			AgeValidation.validateAge(age);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}

}
