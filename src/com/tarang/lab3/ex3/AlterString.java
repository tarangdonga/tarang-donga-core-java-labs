package com.tarang.lab3.ex3;

public class AlterString {

	public static String alterString(String str) {
		String vowels = "AEIOUaeiou";
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isLetter(ch) && vowels.indexOf(ch) == -1) {
				ch = (char) (ch + 1);
			}

			result.append(ch);
		}

		return result.toString();
	}

	public static void main(String[] args) {
		System.out.println(AlterString.alterString("JAVA"));
	}
}