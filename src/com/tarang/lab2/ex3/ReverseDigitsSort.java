package com.tarang.lab2.ex3;

import java.util.Arrays;

public class ReverseDigitsSort {

	public static int[] getSorted(int[] arr) {
		int[] result = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int reversed = 0;

			while (num > 0) {
				reversed = reversed * 10 + (num % 10);
				num /= 10;
			}

			result[i] = reversed;
		}

		Arrays.sort(result);
		return result;
	}

	public static void main(String[] args) {
		int[] numbers = { 123, 456, 789, 122 };

		int[] result = ReverseDigitsSort.getSorted(numbers);

		System.out.println(Arrays.toString(result));

	}

}
