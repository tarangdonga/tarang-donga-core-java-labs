package com.tarang.lab1.ex3;

import java.util.Scanner;

public class Fibonacci {

	public static long getFibonacciRecursive(int n) {
		if (n <= 0)
			return 0;
		if (n == 1)
			return 1;

		return getFibonacciRecursive(n - 1) + getFibonacciRecursive(n - 2);
	}

	public static long getFibonacciIterative(int n) {
		if (n <= 0)
			return 0;
		if (n == 1)
			return 1;

		long prev2 = 0;
		long prev1 = 1;
		long current = 0;

		for (int i = 2; i <= n; i++) {
			current = prev1 + prev2;
			prev2 = prev1;
			prev1 = current;
		}
		return current;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number (n) for the Fibonacci sequence: ");
		if (scanner.hasNextInt()) {
			int n = scanner.nextInt();

			if (n < 0) {
				System.out.println("Please enter a non-negative integer.");
			} else {

				long iterativeResult = Fibonacci.getFibonacciIterative(n);

				System.out.println("Iterative F(" + n + ") = " + iterativeResult);

				long recursiveResult = Fibonacci.getFibonacciRecursive(n);

				System.out.println("Recursive: F(" + n + ") = " + recursiveResult);
			}
		} else {
			System.out.println("Error: Invalid input. Please enter an integer.");
		}

		scanner.close();
	}
}
