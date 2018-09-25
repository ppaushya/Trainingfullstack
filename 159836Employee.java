package org.cap.demo;

import java.util.Scanner;

public class Employee {

	Scanner sc=new Scanner(System.in);
	
	int empId;
	String empName=new String();
	int age;
	boolean isPermanent;
	char gender;
	String address;
	
	public void getEmployee()
	{
		System.out.println("Emp Id: ");
		empId=sc.nextInt();
		System.out.println("Emp Name: ");
		empName=sc.next();
		System.out.println("Age: ");
		age=sc.nextInt();
		System.out.println("isPermanent: ");
		isPermanent=sc.nextBoolean();
		System.out.println("Gender: ");
		gender=sc.next().charAt(0);
		System.out.println("Adress: ");
		address=sc.next();
	}
	
	public void printEmployee()
	{
		System.out.println("Emp Id: "+empId);
		
		System.out.println("Emp Name: "+empName);
		System.out.println("Age: "+age);
		System.out.println("isPermanent: "+isPermanent);
		System.out.println("Gender: "+gender);
		System.out.println("Adress: "+address);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.getEmployee();
		emp.printEmployee();
	}
	

}
