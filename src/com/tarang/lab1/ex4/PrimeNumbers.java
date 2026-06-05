package com.tarang.lab1.ex4;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt the user for input
		System.out.print("Enter an integer: ");
		int limit = scanner.nextInt();

		System.out.println("Prime numbers up to " + limit + ":");

		for (int i = 2; i <= limit; i++) {
			if (PrimeNumbers.isPrime(i)) {
				System.out.print(i + " ");
			}
		}

		scanner.close();
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

}
