package com.cg.eis.service;

import java.util.HashMap;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public void addEmployee(Employee emp, HashMap<Integer, Employee> map) {
		map.put(emp.getId(), emp);
	}

	@Override
	public void deleteEmployee(int id, HashMap<Integer, Employee> map) {
		if (map.containsKey(id)) {
			map.remove(id);
			System.out.println("Employee removed.");
		} else {
			System.out.println("Employee not found.");
		}
	}

	@Override
	public void displayByScheme(String scheme, HashMap<Integer, Employee> map) {

		boolean found = false;

		for (Employee emp : map.values()) {
			if (emp.getInsuranceScheme().equalsIgnoreCase(scheme)) {
				System.out.println(emp);
				found = true;
			}
		}

		if (!found) {
			System.out.println("No employees found for scheme: " + scheme);
		}
	}

	@Override
	public void displayAll(HashMap<Integer, Employee> map) {

		if (map.isEmpty()) {
			System.out.println("No employees available.");
			return;
		}

		for (Employee emp : map.values()) {
			System.out.println(emp);
		}
	}
}