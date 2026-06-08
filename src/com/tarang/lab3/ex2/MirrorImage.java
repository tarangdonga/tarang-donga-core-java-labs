package com.tarang.lab3.ex2;

public class MirrorImage {

	public static String getImage(String str) {
		StringBuffer sb = new StringBuffer(str);
		String reverse = sb.reverse().toString();

		return str + "|" + reverse;
	}

	public static void main(String[] args) {
		String input = "WORLD";
		System.out.println(MirrorImage.getImage(input));
	}

}
