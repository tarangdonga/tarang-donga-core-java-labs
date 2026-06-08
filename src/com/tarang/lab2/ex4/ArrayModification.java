package com.tarang.lab2.ex4;

import java.util.Arrays;

public class ArrayModification {

	public static int[] modifyArray(int[] arr) {
		Arrays.sort(arr);

		int count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				count++;
			}
		}

		int[] result = new int[count];

		int index = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (i == arr.length - 1 || arr[i] != arr[i + 1]) {
				result[index++] = arr[i];
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 2, 5, 2, 8, 5, 1 };

		int[] result = ArrayModification.modifyArray(arr);

		System.out.println(Arrays.toString(result));
	}

}
