package org.cap.demo;

import java.util.Scanner;

public class Student {

	String name;
	int mark1,mark2,mark3;
	int sum;
	float avg;
	
	public void getStudent() {
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("ENETER NAME:");
		 name=scanner.next();
		 
		 System.out.println("ENTER MARK1:");
		 mark1=scanner.nextInt();
		 
		 System.out.println("ENTER MARK2:");
		 mark2=scanner.nextInt();
		 
		 System.out.println("ENTER MARK3:");
		 mark3=scanner.nextInt();
		 
		 scanner.close();
		
	}
	
  public int findScore() {
	  sum=mark1+mark2+mark3;
	  return sum;
  }
  
  public float findAverage() {
	  avg=sum/3;
	  return avg;
  }
  public void printStudent() {
	  System.out.println("STUDENT DETAILS:\n"+name+"\n"+mark1+"\n"+mark2+"\n"+mark3+"\n"+sum+"\n"+avg);
	  
  }
	
	
	
	public static void main(String[] args) {
		Student obj=new Student();
		obj.getStudent();
		obj.findScore();
		obj.findAverage();
		obj.printStudent();
		

	}

}
