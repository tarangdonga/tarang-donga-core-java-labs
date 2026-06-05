package com.tarang.lab1.ex6;

public class SquaresDifference {

	public static long calculateDifference(int n) {
		long sumOfNumbers = (long) n * (n + 1) / 2;

		long squareOfSum = sumOfNumbers * sumOfNumbers;

		long sumOfSquares = (long) n * (n + 1) * (2 * n + 1) / 6;

		return (sumOfSquares - squareOfSum);
	}

	public static void main(String[] args) {

		int n = 10;
		long result = SquaresDifference.calculateDifference(n);

		System.out.println("The calculated difference for the first " + n + " natural numbers: " + result);
	}

}
