package com.tarang.lab1.ex5;

public class NaturalNumbers {

	public static int calculateSum(int n) {
		int sum = 0;
		int i = 0;
		int count = 0;

		while (count <= n) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
				count++;
			}
			i++;
		}
		return sum;
	}

	public static void main(String[] args) {

		int n = 7;

		int sum = NaturalNumbers.calculateSum(n);

		System.out.println("Sum of the first " + n + " numbers divisible by 3 or 5 = " + sum);
	}
}
