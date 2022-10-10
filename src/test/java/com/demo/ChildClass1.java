package com.demo;

import com.inheritance.ParentClass;

public class ChildClass1  extends ParentClass{

	public static void main(String[] args) {
		
		ChildClass1 obj = new ChildClass1();
		obj.displayStdId(1122);
//		obj.displaySchoolName("Model High School");
//		obj.displaySchoolAnnaulIncome();
//		obj.displaySchoolTutionFee();
		
		ParentClass parentObj =  new ParentClass();
		//parentObj.displaySchoolTutionFee();

	}
	
	public void displayStdId(int stdID){
		System.out.println(stdID);
	}
	
	

}
