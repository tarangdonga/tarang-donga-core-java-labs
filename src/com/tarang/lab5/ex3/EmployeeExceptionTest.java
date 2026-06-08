package com.tarang.lab5.ex3;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class EmployeeExceptionTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Employee Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Salary: ");
		double salary = sc.nextDouble();

		Employee emp = new Employee(name, salary);

		try {
			emp.validateSalary();
		} catch (EmployeeException e) {
			System.out.println("Exception: " + e.getMessage());
		}

		sc.close();
	}

}
