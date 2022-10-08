package com.java.methods;

public class StaticNonStaticMethodsDemo {
	
	static {
		System.out.println("I am static block");
	}

	public static void main(String[] abc) {
		
		System.out.println("I am main()");
		displsyStdID(); //without object creation and without class name.. 
		StaticNonStaticMethodsDemo.displsyStdID(); //without object creation but with class name..
		//creating a class object using new operator
		//MethodsDemo() - this is called class constructor
		StaticNonStaticMethodsDemo myObj  =  new StaticNonStaticMethodsDemo(); 
		myObj.displsyStdName();
	}
	
	//static method
	public static void displsyStdID() {
		System.out.println(1122);
	}
	
	//non-static method
		public void displsyStdName() {
			System.out.println("John Doe");
		}

}
