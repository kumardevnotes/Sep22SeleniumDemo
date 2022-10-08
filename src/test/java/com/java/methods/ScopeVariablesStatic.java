package com.java.methods;

public class ScopeVariablesStatic {
	//static variable or class level variable
	//And can be modified in any static method
	
	static int stdID = 100;

	public static void main(String[] args) {
		System.out.println(stdID);
		displayStdID(); //calling a non static method
		
		stdID =  200;
		
		System.out.println(stdID);
		displayStdID(); //calling a non static method
		
		//local to main() only and supposed to be used in main() only
		String stdName = "John Doe";
		System.out.println(stdName);
	}
	
	public static void displayStdID() {
		System.out.println(stdID);
		//we are not supposed to use below local variable . It throws an error
		//System.out.println(stdName);
	}

}
