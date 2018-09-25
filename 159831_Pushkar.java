package org.cap.demo;

import java.util.Scanner;

public class Employee {

	int EmpId;
	String empname;
	int age;
	boolean ispermanent;
	String gender;
	String Address;
	
	public void getEmployee()
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Employee Id : ");
		EmpId=scanner.nextInt();

		System.out.println("Enter Employee Name : ");
		empname=scanner.next();

		System.out.println("Enter Employee Age : ");
		age=scanner.nextInt();
		
		System.out.println("Is Permanent : ");
		ispermanent=scanner.nextBoolean();
		
		System.out.println("Enter Employee Gender : ");
		gender=scanner.next();

		System.out.println("Enter Employee Address : ");
		Address=scanner.next();
	}
	
	public void printEmployee()
	{
		System.out.println("Employee Id :" + EmpId);
		System.out.println("Employee Name :" + empname);
		System.out.println("Employee Age : " + age);
		System.out.println("Employee Gender :" + gender);
		System.out.println("Employee Address : " + Address);
	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		 emp.getEmployee();
		 emp.printEmployee();
		
	}

}
