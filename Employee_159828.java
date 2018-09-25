package org.cap.demo;

import java.util.Scanner;

public class Employee_159828 {

	int empID;
	String empName;
	int age;
	boolean isPermanent;
	char gender;
	String address;
	
	public void getEmployee()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter emp ID:");
		empID=scan.nextInt();
		System.out.println("Enter emp name:");
		empName=scan.next();
		System.out.println("Enter emp age:");
		age=scan.nextInt();
		System.out.println("Enter if employee is permanent:");
		isPermanent=scan.nextBoolean();
		System.out.println("Enter emp gender:");
		gender=scan.next().charAt(0);
		System.out.println("Enter emp address:");
		address=scan.next();
	}
	
	public void printEmployee()
	{
		System.out.println("Emp ID: "+empID);
		System.out.println("Emp Name: "+empName);
		System.out.println("Emp Age: "+age);
		System.out.println("Emp is Permanent?: "+isPermanent);
		System.out.println("Emp Gender: "+gender);
		System.out.println("Emp Address: "+address);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee_159828 obj=new Employee_159828();
		obj.getEmployee();
		obj.printEmployee();

	}

}
