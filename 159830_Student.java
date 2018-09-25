package org.cap.demo;

import java.util.Scanner;

public class Student {

	String name;
	int marks1, marks2, marks3, total;
	float avg;

	public void getStudent() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Student Name:");
		name = scanner.next();

		System.out.println("Enter marks1,marks2 and marks3:");
		marks1 = scanner.nextInt();
		marks2 = scanner.nextInt();
		marks3 = scanner.nextInt();

		scanner.close();

	}

	public int findScore() {
		total = marks1 + marks2 + marks3;
		return total;
	}

	public float findAvg() {
		avg = total / 3;
		return avg;
	}

	public void printStudent() {
		System.out.println("Student name is: " + name);
		System.out.println("Student total score is: " + total);
		System.out.println("Student average score is: " + avg);
	}

	public static void main(String[] args) {

		Student obj = new Student();
		obj.getStudent();
		obj.findScore();
		obj.findAvg();
		obj.printStudent();
	}

}