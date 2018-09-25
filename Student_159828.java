package org.cap.demo;

import java.util.Scanner;

public class Student_159828 {

	String name;
	int mark1,mark2,mark3;
	
	public void getStudent()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter student name:");
		name=scan.next();
		System.out.println("Enter marks1:");
		mark1=scan.nextInt();
		System.out.println("Enter marks2:");
		mark2=scan.nextInt();
		System.out.println("Enter marks3:");
		mark3=scan.nextInt();	
	}
	
	public int findScore()
	{
		return mark1+mark2+mark3;
	}
	
	public float findAverage()
	{
		return (mark1+mark2+mark3)/3;
	}
	
	public void printStudent()
	{
		System.out.println("Student Name:"+name);
		System.out.println("Marks1:"+mark1);
		System.out.println("Marks2:"+mark2);
		System.out.println("Marks3:"+mark3);
		System.out.println("Total score:"+findScore());
		System.out.println("Average Score:"+findAverage());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_159828 obj=new Student_159828();
		obj.getStudent();
		obj.printStudent();

	}
}
