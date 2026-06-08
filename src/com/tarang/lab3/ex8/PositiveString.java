package com.tarang.lab3.ex8;

public class PositiveString {

	public static boolean isPositiveString(String str) {
		str = str.toUpperCase();

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) >= str.charAt(i + 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(PositiveString.isPositiveString("ANT"));
		System.out.println(PositiveString.isPositiveString("APPLE"));
	}
}