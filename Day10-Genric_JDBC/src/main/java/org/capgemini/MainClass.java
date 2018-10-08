package org.capgemini;

public class MainClass {

	public static void main(String[] args) {
		
		Calculate<Integer, Double> calculate=new Calculate<>();
		calculate.setNum1(23);
		calculate.setNum2(56.45);
		System.out.println(calculate.getNum1()+calculate.getNum2());
		
		
		
		
		
		
		
		/*Sender<String> str=new Sender<>();
		str.setMessage("Hello! Good Morning");
		System.out.println(str.getMessage());
		
		Sender<Integer> myData=new Sender<>();
		myData.setMessage(435435);
		System.out.println(myData.getMessage());
		*/
		
	}

}
