package org.cap.demo;

import java.util.Scanner;

public class Student
{

	int mark1, mark2, mark3;
	String studentname;
	
	public void getStudent()
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Student Name: ");
		studentname=scanner.next();
		
		System.out.println("Enter Marks obtained in Subject 1: ");
		mark1=scanner.nextInt();
		
		System.out.println("Enter Marks obtained in Subject 2: ");
		mark2=scanner.nextInt();
		
		System.out.println("Enter Marks obtained in Subject 3: ");
		mark3=scanner.nextInt();
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
		System.out.println("Student name: " + studentname +
						"\nMarks in Subject 1: " + mark1 +
						"\nMarks in Subject 2: " + mark2 +
						"\nMarks in Subject 3: " + mark3 +
						"\nTotal Marks Scored: " + findScore() +
						"\nAverage Score: " + findAverage());
	}
	
	public static void main(String[] args)
	{
		Student obj=new Student();
		obj.getStudent();
		obj.printStudent();
	}
}
