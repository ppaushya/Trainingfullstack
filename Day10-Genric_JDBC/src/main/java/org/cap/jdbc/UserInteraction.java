package org.cap.jdbc;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class UserInteraction {
	Scanner scanner=new Scanner(System.in);
	
	
	
	public int promptEmployeeID() {
		System.out.println("Enter Employee Id:");
		return scanner.nextInt();
	}

	public Employee createEmployee() {
		Employee employee=new Employee();
		System.out.println("Enter Employee Id:");
		employee.setEmpId(scanner.nextInt());
		
		System.out.println("Enter Employee FirstName:");
		employee.setFirstName(scanner.next());
		
		System.out.println("Enter Employee LastName:");
		employee.setLastName(scanner.next());
		
		System.out.println("Enter Employee Salary:");
		employee.setSalary(scanner.nextDouble());
		
		System.out.println("Enter Employee DateOf Joining[yyyy-mm-dd]:");
		String[] date=scanner.next().split("-");
		employee.setEmpdoj(LocalDate.of(
				Integer.parseInt(date[0]), 
				Integer.parseInt(date[1]), 
				Integer.parseInt((date[2]))));
		
		return employee;
	}

	public void printAllEmployees(List<Employee> employees) {
		System.out.println("EmployeeId\tFirstName\tLastName\tSalary\tDateOfjoining");
		for(Employee employee:employees)
			System.out.println(employee.getEmpId() +"\t"
					+employee.getFirstName()+"\t" 
					+employee.getLastName()+"\t" 
					+employee.getSalary()+"\t" 
					+employee.getEmpdoj() );
		
	}

}
