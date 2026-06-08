package com.tarang.lab5.ex3;

import com.cg.eis.exception.EmployeeException;

public class Employee {

	private String name;
	private double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public void validateSalary() throws EmployeeException {
		if (salary < 3000) {
			throw new EmployeeException("Salary cannot be less than 3000.");
		} else {
			System.out.println("Valid Employee: " + name + ", Salary: " + salary);
		}
	}
}