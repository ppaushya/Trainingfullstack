package org.cap.jdbc;

import java.time.LocalDate;

public class Employee {
	private int empId;
	private String firstName;
	private String lastName;
	private double salary;
	private LocalDate empdoj;
	public Employee() {
		
	}
	
	
	public Employee(int empId, String firstName, String lastName, double salary, LocalDate empdoj) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.empdoj = empdoj;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getEmpdoj() {
		return empdoj;
	}
	public void setEmpdoj(LocalDate empdoj) {
		this.empdoj = empdoj;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ ", empdoj=" + empdoj + "]";
	}
	
	

}
