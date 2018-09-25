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
		
		System.out.println("Enter Employee Id: ");
		empId = scanner.nextInt();
		System.out.println("Enter Employee Name: ");
		empName = scanner.next();
		System.out.println("Enter Employee Age: ");
		age = scanner.nextInt();
		System.out.println("Enter if Employee is permanent: ");
		isPermanent = scanner.nextBoolean();
		System.out.println("Enter Gender: ");
		gender = scanner.next().charAt(0);
		System.out.println("Enter Address: ");
		address = scanner.next();
		
	}
	
	public void printEmployee() {
		String str = "Employee Details:\n"+
				"Employee Id: "+empId+"\n"+
				"Employee Name: "+empName+"\n"+
				"Employee Age: "+age+"\n"+
				"Is Employee permanent: "+isPermanent+"\n"+
				"Gender: "+gender+"\n"+
				"Address: "+address;
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		emp.getEmployee();
		emp.printEmployee();
	}
	
}
