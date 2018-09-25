package org.cap.demo;

import java.util.Scanner;

public class Student {
	String name;
	int mark1;
	int mark2;
	int mark3;
	
	public void getStudent() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Student Name:");
		name=scan.next();
		System.out.println("Enter mark1:");
		mark1=scan.nextInt();
		System.out.println("Enter mark2:");
		mark2=scan.nextInt();
		System.out.println("Enter mark3:");
		mark3=scan.nextInt();
		
	}
	public int findScore() {
		int total=mark1+mark2+mark3;
		return total;
	}
	public float findAverage() {
		float avg=(findScore()/3);
		return avg;
	}
	public void printStudent() {
		System.out.println("Student Name:"+name);
		System.out.println("Student mark1:"+mark1);
		System.out.println("Student mark2:"+mark2);
		System.out.println("Student mark3:"+mark3);
		System.out.println("Student score:"+findScore());
		System.out.println("Student average:"+findAverage());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		obj.getStudent();
		obj.printStudent();
	}

}
