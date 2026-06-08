package com.tarang.lab3.ex4;

public class ModifyNumber {

	public static int modifyNumber(int number1) {
		String str = String.valueOf(number1);
		StringBuffer result = new StringBuffer();

		for (int i = 0; i < str.length() - 1; i++) {
			int digit1 = str.charAt(i) - '0';
			int digit2 = str.charAt(i + 1) - '0';

			result.append(Math.abs(digit1 - digit2));
		}

		result.append(str.charAt(str.length() - 1));

		return Integer.parseInt(result.toString());
	}

	public static void main(String[] args) {
		int number = 45862;
		System.out.println(ModifyNumber.modifyNumber(number));
	}
}