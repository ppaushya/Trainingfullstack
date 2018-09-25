package org.cap.demo;

import java.util.*;

public class Employee {
	int empId;
	String empName;
	int age;
	boolean isPermanent;
	String gender;
	String address;
	public void getEmployee() {
		Scanner s=new Scanner(System.in);
		empId=s.nextInt();
		empName=s.next();
		age=s.nextInt();
		isPermanent=s.nextBoolean();
		gender=s.next();
		address=s.next();
		
		
	}
	public void printEmployee()
	{
		System.out.println("Employee Id:"+empId);
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee age:"+age);
		System.out.println("Employee Status:"+isPermanent);
		System.out.println("Employee gender:"+gender);
		System.out.println("Employee address:"+address);


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Employee emp=new Employee();
          emp.getEmployee();
          emp.printEmployee();
	}

}
