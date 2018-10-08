package org.cap.jdbc;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MainClass {
	
	static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		
		UserInteraction userInteraction=new UserInteraction();
		EmployeeDao employeeDao=new EmployeeDaoImpl();
		int option;
		String choice;
		do {
		System.out.println("1.Create Employee");
		System.out.println("2.Update Employee");
		System.out.println("3.Delete Employee");
		System.out.println("4.List All Employee");
		System.out.println("5.Find Employee");
		System.out.println("6.Exit");
		System.out.println("Enter your option:");
		option=scanner.nextInt();
			switch(option) {
			case 1:
			//	Employee employee=new Employee(789, "Kamal", "jERRY", 23000, LocalDate.of(2010,3,12));
				Employee employee=userInteraction.createEmployee();
				employeeDao.createEmployee(employee);
				break;
			case 2:
				break;
			case 3:
				int empId=userInteraction.promptEmployeeID();
				employeeDao.deleteEmployee(empId);
				break;
			case 4:
				List<Employee> employees= employeeDao.getAllEmployees();
				userInteraction.printAllEmployees(employees);
				break;
			case 5:
				int empId1=userInteraction.promptEmployeeID();
				Employee employee1=employeeDao.findEmployee(empId1);
				break;
			case 6:
				System.exit(0);
			default:
				System.out.println("Sorry! Invalid Option!");
			}
			System.out.println("You wish to continue[y|n]:");
			choice=scanner.next();
			
		}while(choice.charAt(0)=='y'||choice.charAt(0)=='Y');
		}

}
