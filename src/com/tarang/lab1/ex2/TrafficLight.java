package com.tarang.lab1.ex2;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Traffic Light Simulator:");
		System.out.println("Select a light color by entering its number:");
		System.out.println("1 -> Red");
		System.out.println("2 -> Yellow");
		System.out.println("3 -> Green");
		System.out.print("Enter your choice (1, 2, or 3): ");

		if (scanner.hasNextInt()) {
			int choice = scanner.nextInt();
			System.out.println();

			switch (choice) {
			case 1:
				System.out.println("Stop");
				break;
			case 2:
				System.out.println("Ready");
				break;
			case 3:
				System.out.println("Go");
				break;
			default:
				System.out.println("Error: Invalid selection. Please choose 1, 2, or 3.");
				break;
			}
		} else {
			System.out.println("\nError: Please enter a valid integer.");
		}

		scanner.close();
	}
}
