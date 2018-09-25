package org.cap.demo;

import java.util.Scanner;

public class Student {

	String studentName;
	int mark1,mark2,mark3;
	
	public void getStudent() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Student Name: ");
		studentName = scanner.next();
		System.out.println("Enter Mark 1: ");
		mark1 = scanner.nextInt();
		System.out.println("Enter Mark 2: ");
		mark2 = scanner.nextInt();
		System.out.println("Enter Mark 3: ");
		mark3 = scanner.nextInt();
		
	}
	
	public int findScore() {
		return mark1+mark2+mark3;
	}
	
	public float findAverage() {
		return (findScore())/3;
	}
	
	public void printStudent() {
		String str = "Student Details:\n"+
				"Student Name: "+studentName+"\n"+
				"Marks in Subject 1 : "+mark1+"\n"+
				"Marks in Subject 2 : "+mark2+"\n"+
				"Marks in Subject 3 : "+mark3+"\n"+
				"Total Marks : "+findScore()+"\n"+
				"Average Marks : "+findAverage();
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student std = new Student();
		std.getStudent();
		std.printStudent();
	}

}
