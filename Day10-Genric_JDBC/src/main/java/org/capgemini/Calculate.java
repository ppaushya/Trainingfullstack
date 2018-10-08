package org.capgemini;

public class Calculate <T,R>{
	
	private T num1;
	private R num2;
	public T getNum1() {
		return num1;
	}
	public void setNum1(T num1) {
		this.num1 = num1;
	}
	public R getNum2() {
		return num2;
	}
	public void setNum2(R num2) {
		this.num2 = num2;
	}
	
	
	
	public void calculate(Employee<? extends T> emp){
		System.out.println(emp.getClass());
	}
	

}
