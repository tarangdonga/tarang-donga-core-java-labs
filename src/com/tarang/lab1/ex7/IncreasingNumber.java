package com.tarang.lab1.ex7;

public class IncreasingNumber {

	public static boolean isIncreasingNumber(int number) {
		if (number < 10) {
			return true;
		}

		int rightDigit = number % 10;
		number /= 10;

		while (number > 0) {
			int leftDigit = number % 10;

			if (leftDigit > rightDigit) {
				return false;
			}

			rightDigit = leftDigit;
			number /= 10;
		}

		return true;
	}

	public static void main(String[] args) {
		int test1 = 134468;
		int test2 = 13542;
		int test3 = 7;

		System.out.println(test1 + ": " + IncreasingNumber.isIncreasingNumber(test1));
		System.out.println(test2 + ": " + IncreasingNumber.isIncreasingNumber(test2));
		System.out.println(test3 + ": " + IncreasingNumber.isIncreasingNumber(test3));

	}

}
