package com.cg.eis.pl;

import java.util.HashMap;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {

		HashMap<Integer, Employee> map = new HashMap<>();
		EmployeeService service = new EmployeeServiceImpl();
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("\n--- Employee Insurance System ---");
			System.out.println("1. Add Employee");
			System.out.println("2. Display All Employees");
			System.out.println("3. Search by Insurance Scheme");
			System.out.println("4. Delete Employee");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("ID: ");
				int id = sc.nextInt();

				sc.nextLine();

				System.out.print("Name: ");
				String name = sc.nextLine();

				System.out.print("Salary: ");
				double salary = sc.nextDouble();

				sc.nextLine();

				System.out.print("Designation: ");
				String desig = sc.nextLine();

				Employee emp = new Employee(id, name, salary, desig);
				service.addEmployee(emp, map);

				System.out.println("Employee added successfully.");
				break;

			case 2:
				service.displayAll(map);
				break;

			case 3:
				sc.nextLine();
				System.out.print("Enter Scheme (A/B/C/No Scheme): ");
				String scheme = sc.nextLine();
				service.displayByScheme(scheme, map);
				break;

			case 4:
				System.out.print("Enter Employee ID to delete: ");
				int delId = sc.nextInt();
				service.deleteEmployee(delId, map);
				break;

			case 5:
				System.out.println("Exiting...");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}