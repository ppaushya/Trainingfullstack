package org.cap.demo;

import java.util.Scanner;

public class Employee {

	int empId;
	 String empName=new String();
	 int age;
	 boolean isPermanent;
	 char gender;
	 String address;
	 
	 public void getEmployee()
	 {Scanner scanner=new Scanner(System.in);
	 System.out.println("enter employeeid");
	 empId=scanner.nextInt();
	 System.out.println("enter employeename");
	 empName=scanner.next();
	 System.out.println("enter age");
	 age=scanner.nextInt();
	 System.out.println("enter boolean value");
	 isPermanent=scanner.nextBoolean();
	 
	 System.out.println("enter gender");
	 gender=scanner.next().charAt(0);
	 System.out.println("enter address");
	 address=scanner.next();
	 scanner.close();}
	 
public void printEmployee()
{ System.out.println("Emp id:" + empId);
System.out.println("Empname:" + empName);
System.out.println("age:" + age);
System.out.println("ispermanent:" + isPermanent);
System.out.println("gender:" + gender);
System.out.println("address:" + address);

}
public static void main(String[] args) {
Employee emp=new Employee();
emp.getEmployee();
emp.printEmployee();
}}


