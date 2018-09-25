package org.cap.demo;

import java.util.Scanner;

public class Student {

Scanner sc=new Scanner(System.in);
	
	
	String name=new String();
	int m1,m2,m3;
	
	
	public void getStudent()
	{
		
		System.out.println("Name: ");
		name=sc.next();
	}
	
	public void findScore()
	{
		System.out.println("Marks 1: ");
		m1=sc.nextInt();
		System.out.println("Marks 2: ");
		m2=sc.nextInt();
		System.out.println("Marks 3: ");
		m3=sc.nextInt();
	}
	
	public float findAvg()
	{
		
		return (m1 + m2 + m3)/3;
	}
	public void printStudent()
	{
		System.out.println("Name: "+name);
		
		System.out.println("Marks 1: "+m1);
		System.out.println("Marks 2: "+m2);
		System.out.println("Marks 3: "+m3);
		
	}
	
	public static void main(String[] args) {
		Student stud=new Student();
		stud.getStudent();
		stud.findScore();
		stud.printStudent();
		System.out.println("Average: "+stud.findAvg());
	}
	

}
