package org.capgemini;

public class MainClass1 {

	public static void main(String[] args) {
		Calculate< Employee<Address>, String> calculate=new Calculate<>();
		Employee<Address> emp=new Employee<>();
		
		Salary salary=new Salary();
		
		calculate.calculate(salary);

	}

}
