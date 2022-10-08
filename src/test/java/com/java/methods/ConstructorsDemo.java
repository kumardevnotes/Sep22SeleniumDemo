package com.java.methods;

public class ConstructorsDemo {
	
	//default constructor
	ConstructorsDemo(){
		System.out.println("I am default constructor");
	}
	
	//param constructor
	ConstructorsDemo(String stdName, int stdId){
		System.out.println("StdName is: "+stdName);
	}

	public static void main(String[] args) {

//		ConstructorsDemo obj = new ConstructorsDemo();
//		obj.displayStdID();
		
		ConstructorsDemo obj2 = new ConstructorsDemo("Joh Legend", 11334455);
		obj2.displayStdID();
		
	}
	
	public void displayStdID() {
		System.out.println(1122);
	}

}
