package org.cap.demo;

import java.util.Scanner;

public class Student {
	String name;
	int mark1,mark2,mark3;
	
	public void getStudent()
	{
		Scanner scan=new Scanner(System.in);
		name=scan.next();
		mark1=scan.nextInt();
		mark2=scan.nextInt();
		mark3=scan.nextInt();
	}
  public int findScore()
  {
	  int score=0;
	  score=mark1+mark2+mark3;
	  return score;
  }
  public float findAvg()
  {
	  float avg=0;
	  avg=(mark1+mark2+mark3)/3;
	  return avg;
  }
  public void printStudent() {
	  int sc=findScore();
	  float average=findAvg();
	  System.out.println("Student Name:"+name);
	  System.out.println("Student score:"+sc);
	  System.out.println("Student Average:"+average);


  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Student s1=new Student();
          s1.getStudent();
          s1.findScore();
          s1.findAvg();
          s1.printStudent();
	}

}
