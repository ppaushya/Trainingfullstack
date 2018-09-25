package org.cap.demo;

import java.util.Scanner;

public class Employee {
	
	int empid;
	String empname;
	int age;
	boolean isPermanent;
	char gender;
	String address;

	public void getEmployee()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter empid");
		empid=scanner.nextInt();
		System.out.println("Enter empname");
		empname=scanner.next();
		System.out.println("Enter age");
		age=scanner.nextInt();
		System.out.println("Enter boolean value");
		isPermanent=scanner.nextBoolean();
		System.out.println("Enter gender");
		gender= scanner.next().charAt(0);
		System.out.println("Enter address");
		address=scanner.next();
		
		scanner.close();
		
	}
	
	public void printEmployee()
	{
		System.out.println("Empid is: "+empid);
		System.out.println("Empname is: "+empname);

		System.out.println("Age is: "+age);

		System.out.println("boolean is: "+isPermanent);

		System.out.println("gender is: "+gender);
		
		System.out.println("address is: "+address);


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee em=new Employee();
		
		em.getEmployee();
		
		em.printEmployee();
		
		


	}

}