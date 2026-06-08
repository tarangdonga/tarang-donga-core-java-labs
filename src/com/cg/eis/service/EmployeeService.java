package com.cg.eis.service;

import java.util.HashMap;

import com.cg.eis.bean.Employee;

public interface EmployeeService {

	void addEmployee(Employee emp, HashMap<Integer, Employee> map);

	void deleteEmployee(int id, HashMap<Integer, Employee> map);

	void displayByScheme(String scheme, HashMap<Integer, Employee> map);

	void displayAll(HashMap<Integer, Employee> map);
}