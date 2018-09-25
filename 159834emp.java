package org.cap.demo;
import java.util.Scanner;
public class scanneremp {
	
	int empID;
	String empName;
	int age;
	boolean ispermnt;
	String gender;
	String address;
public void getdata() {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Id");
	empID=scan.nextInt();
	
	System.out.println("Enter name");
    empName=scan.next();
	
    System.out.println("Enter age");
	age=scan.nextInt();
	
	System.out.println("IS he permanent");
	ispermnt=scan.nextBoolean();
	
	System.out.println("Enter gender");
	gender=scan.next();
	
	System.out.println("Enter adrss");
	address=scan.next();
	

	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        scanneremp obj=new scanneremp();
        obj.getdata();
        System.out.println("EmplId:" +obj.empID);
        System.out.println("Name:" +obj.empName);
        System.out.println("age:" +obj.age);
        System.out.println("permant:" +obj.ispermnt);
        System.out.println("gender:" +obj.gender);
        System.out.println("address:" +obj.address);
      
        
	}

}
