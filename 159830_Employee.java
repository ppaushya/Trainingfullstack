package org.cap.demo;

import java.util.Scanner;

public class Employee {

	int empId;
	String empName;
	int age;
	boolean isPermanent;
	char gender;
	String address;

	public void getEmployee() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Employee Id:");
		empId = scanner.nextInt();

		System.out.println("Enter Employee Name:");
		empName = scanner.next();

		System.out.println("Enter Age:");
		age = scanner.nextInt();

		System.out.println("Enter Gender:");
		gender = scanner.next().charAt(0);

		System.out.println("Enter Address:");
		address = scanner.next();

		scanner.close();

	}

	public void printEmployee() {
		System.out.println("Employee Id is:" + empId);
		System.out.println("Employee Name is:" + empName);
		System.out.println("Employee Age is:" + age);
		System.out.println("Employee Gender is:" + gender);
		System.out.println("Employee Address is:" + address);
	}

	public static void main(String[] args) {

		Employee obj = new Employee();
		obj.getEmployee();
		obj.printEmployee();
	}

}
