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
   	 System.out.println("Enter empId:");
   	 empId=scan.nextInt();
   	 
   	 System.out.println("Enter empName");
   	 empName=scan.next();
   	 
   	System.out.println("Enter age");
  	 age=scan.nextInt();
  	 
  	System.out.println("Enter type of Employee");
  	 isPermanent=scan.nextBoolean();
  	 
  	System.out.println("Employee Gender :");
  	gender=scan.next();
  	 
  	System.out.println("Enter address");
  	address=scan.next();
  	scan.close();
	}
	public void printEmployee() {
		System.out.println("Employee ID :" +empId);
		System.out.println("Employee Name :" +empName);
		System.out.println("Employee age :" +age);
		System.out.println("Employee type :" +isPermanent);
		System.out.println("Employee Gender :" +gender);
		System.out.println("Employee Address :" +address);
		
	   	 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee();
		obj.getEmployee();
		obj.printEmployee();
		

	}

}
