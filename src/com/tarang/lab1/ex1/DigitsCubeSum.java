package com.tarang.lab1.ex1;

public class DigitsCubeSum {
	public static int getSumOfCubesOfDigits(int number) {

		int sum = 0;

		while (number > 0) {
			int digit = number % 10;

			sum += digit * digit * digit;
			number /= 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		int exampleNum = 1234;
		int result = DigitsCubeSum.getSumOfCubesOfDigits(exampleNum);

		System.out.println("The sum of the cubes of the digits of " + exampleNum + " is: " + result);
	}
}
