package com.tarang.lab1.ex8;

public class PowerOfTwo {

	public static boolean isPowerOfTwo(long number) {
		if (number <= 0) {
			return false;
		}

		while (number % 2 == 0) {
			number = number / 2;
		}

		return number == 1;
	}

	public static void main(String[] args) {
		System.out.println(16 + " is power of 2? " + PowerOfTwo.isPowerOfTwo(16));
		System.out.println(18 + " is power of 2? " + PowerOfTwo.isPowerOfTwo(18));

	}

}
