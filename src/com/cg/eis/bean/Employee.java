package com.cg.eis.bean;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;

	public Employee(int id, String name, double salary, String designation) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = assignScheme();
	}

	private String assignScheme() {

		if (salary < 5000) {
			return "No Scheme";
		} else if (salary >= 5000 && salary < 20000) {
			return "Scheme C";
		} else if (salary >= 20000 && salary < 40000) {
			return "Scheme B";
		} else {
			return "Scheme A";
		}
	}

	public int getId() {
		return id;
	}

	public String getInsuranceScheme() {
		return insuranceScheme;
	}

	public String getDesignation() {
		return designation;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return id + " | " + name + " | " + salary + " | " + designation + " | " + insuranceScheme;
	}
}