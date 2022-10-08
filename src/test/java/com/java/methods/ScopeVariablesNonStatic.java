package com.java.methods;

public class ScopeVariablesNonStatic {

	//non-static or instance variable should not be used in a static method like main()
	int stdID = 112233; 
	public static void main(String[] args) {
		//below code will throw an error
		//System.out.println(stdID);
		ScopeVariablesNonStatic obj = new ScopeVariablesNonStatic();
		obj.displayStdID();
		System.out.println(obj.stdID);
		
	}
	
	//non-static method
	public void displayStdID() {
		//An instance variable can be used in non-static method as shown below
		System.out.println(stdID);
	}

}
