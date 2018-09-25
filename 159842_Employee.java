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
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENTER EMPLOYEE ID:");
		empId=scanner.nextInt();
		
		System.out.println("ENTER EMPLOYEE NAME:");
		empName=scanner.next();
		
		System.out.println("ENTER EMPLOYEE'S AGE:");
		age=scanner.nextInt();
		
		System.out.println("PERMANENT (YES/NO):");
		isPermanent=scanner.nextBoolean();
		
		System.out.println("GENDER:");
		gender=scanner.next();
		
		System.out.println("ADDRESS:");
		address=scanner.next();
		scanner.close();
		
		
	}
	
	public void printEmployee() {
		System.out.print("EMPLOYEE DETAILS:\n"+empId+"\n"+empName+"\n"+age+"\n"+isPermanent+"\n"+gender+"\n"+address);
		
	}
	
	
	public static void main(String[] args) {
		
		Employee obj=new Employee();
		obj.getEmployee();
		obj.printEmployee();
	

	}

}
