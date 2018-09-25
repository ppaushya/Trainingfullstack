package org.cap.demo;

import java.util.Scanner;

public class Student {
	String name;
	int mark1, mark2, mark3;
	int total,average;
	
	public void getStudent() {
	
	Scanner scan=new Scanner(System.in);
  	 System.out.println("Enter Student Name:");
  	 name=scan.next();
  	 
  	 System.out.println("Enter Marks1:");
  	 mark1=scan.nextInt();
  	 
  	 System.out.println("Enter Marks2:");
  	 mark2=scan.nextInt();
  	 
  	System.out.println("Enter Marks3:");
 	 mark3=scan.nextInt();
 	 scan.close();
  	 
  	
  	 
	}
	
	public int findScore() {
		 total=mark1+mark2+mark3;
		return total;
		
	}
	public float findAverage() {
		 average=total/3;
		return average;
		
	}

	public void printStudent() {
		System.out.println("student name :" +name);
		System.out.println("mark1 :" +mark1);
		System.out.println("mark2 :" +mark2);
		System.out.println("mark3 :" +mark3);
		System.out.println("sum :" +total);
		System.out.println("Average :" +average);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student obj=new Student();
obj.getStudent();
obj.findScore();
obj.findAverage();
obj.printStudent();
	}

}
