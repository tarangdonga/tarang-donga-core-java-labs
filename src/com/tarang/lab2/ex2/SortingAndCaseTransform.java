package com.tarang.lab2.ex2;

import java.util.Arrays;

public class SortingAndCaseTransform {

	public static String[] sortStrings(String[] arr) {
		Arrays.sort(arr);

		int mid = arr.length / 2;

		for (int i = 0; i < arr.length; i++) {
			if (i < mid) {
				arr[i] = arr[i].toUpperCase();
			} else {
				arr[i] = arr[i].toLowerCase();
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		String[] words = { "Banana", "Apple", "Orange", "Grape", "Kiwi" };

		String[] result = SortingAndCaseTransform.sortStrings(words);

		System.out.println(Arrays.toString(result));
	}

}
