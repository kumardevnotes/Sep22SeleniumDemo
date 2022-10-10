package com.inheritance;

public class ChildClass2 extends ParentClass{

public static void main(String[] args) {
		
	ChildClass2 obj = new ChildClass2();
		obj.displayStdId(1133);
		obj.displaySchoolName("Primary School");
	}
	
	public void displayStdId(int stdID){
		System.out.println(stdID);
	}

}
