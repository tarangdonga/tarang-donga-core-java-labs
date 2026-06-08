package com.tarang.lab3.ex1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class IntegerSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter integers separated by spaces:");
		String input = sc.nextLine();

		StringTokenizer st = new StringTokenizer(input);

		int sum = 0;

		System.out.println("Integers entered:");
		while (st.hasMoreTokens()) {
			int num = Integer.parseInt(st.nextToken());
			System.out.println(num);
			sum += num;
		}

		System.out.println("Sum = " + sum);

		sc.close();
	}
}