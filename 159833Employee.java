package org.cap.demo;

import java.util.Scanner;

public class Employee {
	int empId;
	String empName;
	int age;
	boolean isPermanent;
	String gender;
	String address;
	
	public void getEmployee() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Employee Id:");
		empId=scan.nextInt();
		System.out.println("Enter Employee Name:");
		scan.nextLine();
		empName=scan.nextLine();
		System.out.println("Enter Employee age:");
		age=scan.nextInt();
		System.out.println("Enter type of employee:");
		isPermanent=scan.nextBoolean();
		System.out.println("Enter gender of employee:");
		gender=scan.next();
		System.out.println("Enter address:");
		address=scan.next();
		scan.close();
		}
	public void printEmployee() {
		System.out.println("Employee Id:"+empId);
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee age:"+age);
		System.out.println("Employment type:"+isPermanent);
		System.out.println("Employee gender:"+gender);
		System.out.println("Employee address:"+address);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee();
		obj.getEmployee();
		obj.printEmployee();
		
	}

}
