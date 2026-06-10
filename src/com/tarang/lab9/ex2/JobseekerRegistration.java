package com.tarang.lab9.ex2;

import java.util.Scanner;

public class JobseekerRegistration {

	public static boolean validateUsername(String username) {
		if (username == null) {
			return false;
		}

		boolean endsWithJob = username.endsWith("_job");
		boolean hasEnoughCharacters = (username.length() - 4) >= 8;

		return endsWithJob && hasEnoughCharacters;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter jobseeker username: ");
		String username = scanner.nextLine();

		boolean isValid = validateUsername(username);
		System.out.println(isValid);

		scanner.close();
	}
}