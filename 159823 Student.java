package org.cap.demo;

import java.util.Scanner;


public class Student {

	String name;
	int m1;
	int m2;
	int m3;
	int score;
	float average;
	
	public int findScore()
	{
		score=m1+m2+m3;
		return score;
	}
	
	public float findAverage()
	{
		average= (m1+m2+m3)/3;
		return average;
	}
	
	public void getStudent()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter name: ");
		name=scanner.next();
		System.out.println("Enter marks: ");
		m1=scanner.nextInt();
		m2=scanner.nextInt();

		m3=scanner.nextInt();

scanner.close();
		
	}
	
	
	public void printStudent()
	{
		System.out.println(score);
		System.out.println(average);

		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st= new Student();
		
		st.getStudent();
		
		System.out.println(st.findScore());
		System.out.println(st.findAverage());
		
		st.printStudent();

	}

}
