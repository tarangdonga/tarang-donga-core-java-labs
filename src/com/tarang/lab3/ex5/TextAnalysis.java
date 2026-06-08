package com.tarang.lab3.ex5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class TextAnalysis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter text (type END on a new line to finish):");

		int lines = 0;
		int words = 0;
		int characters = 0;

		while (true) {
			String line = sc.nextLine();

			lines++;

			characters += line.length();

			StringTokenizer st = new StringTokenizer(line);
			words += st.countTokens();

			if (line.equals("END")) {
				break;
			}
		}

		sc.close();

		System.out.println("Lines: " + lines);
		System.out.println("Words: " + words);
		System.out.println("Characters: " + characters);
	}
}
