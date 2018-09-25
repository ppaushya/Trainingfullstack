package org.cap.demo;

import java.util.Scanner;

public class Employee
{

	int employeeid;
	String employeename;
	int age;
	boolean isPermanent;
	char gender;
	String address;
	
	public void getEmployee()
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Employee ID: ");
		employeeid=scanner.nextInt();
		
		System.out.println("Enter Employee Name: ");
		employeename=scanner.next();
		
		System.out.println("Enter Age: ");
		age=scanner.nextInt();
		
		System.out.println("Enter If the Employee is permanent: ");
		isPermanent=scanner.nextBoolean();
		
		System.out.println("Enter Gender: ");
		gender=scanner.next().charAt(0);
		
		System.out.println("Enter Address: ");
		address=scanner.next();
	}
	
	public void printEmployee()
	{
		System.out.println("Employee ID: " + employeeid +
						"\nEmployee Name: " + employeename +
						"\nAge: " + age +
						"\nIs the Employee permanent: " + isPermanent +
						"\nGender" +  gender +
						"\nAddress:" + address);
	}
	
	public static void main(String[] args)
	{
		Employee obj=new Employee();
		obj.getEmployee();
		obj.printEmployee();
	}
}
