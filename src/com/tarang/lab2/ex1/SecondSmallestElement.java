package com.tarang.lab2.ex1;

public class SecondSmallestElement {

	public static int getSecondSmallest(int[] arr) {
		if (arr == null || arr.length < 2) {
			return -1;
		}

		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int num : arr) {
			if (num < smallest) {
				secondSmallest = smallest;
				smallest = num;
			} else if (num > smallest && num < secondSmallest) {
				secondSmallest = num;
			}
		}

		if (secondSmallest == Integer.MAX_VALUE) {
			return -1;
		}

		return secondSmallest;
	}

	public static void main(String[] args) {
		int[] numbers = { 15, 22, 85, 18, 31 };

		System.out.println(SecondSmallestElement.getSecondSmallest(numbers));
	}

}
