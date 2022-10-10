package com.inheritance;

public class ChildClassOverrideDemo extends ParentClass{
	
	final int employeeSalary = 10000;

	public static void main(String[] args) {
		ChildClassOverrideDemo obj = new ChildClassOverrideDemo();
		obj.displaySchoolName("Model school");
		obj.displayLogo();
	}
	
	//overrding the parent class method
	public void displaySchoolName(String school) {
		System.out.println("Updated " + school);
	}
	
	//below code throws error
//	public void displayLogo() {
//		System.out.println("Updated " + "Model School logo displayed");
//	}
	
	//below code throws error
//	public void updateSalary(){
//		employeeSalary = employeeSalary + 100;
//	}

}
