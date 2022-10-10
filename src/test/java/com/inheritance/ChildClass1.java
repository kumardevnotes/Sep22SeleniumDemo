package com.inheritance;

public class ChildClass1  extends ParentClass{
	
	//instance variable or non-static variable
	int employeeID =  3344;

	public static void main(String[] args) {
		
		ChildClass1 obj = new ChildClass1();
		//obj.displayStdId(1122);
//		obj.displaySchoolName("Model High School");
//		obj.displaySchoolAnnaulIncome();
//		obj.displaySchoolTutionFee();
		
//		ParentClass parentObj =  new ParentClass();
//		parentObj.displaySchoolTutionFee();
		
		/*
		 * If child and parent class have same variable name
		 * and if you try tocall that variable with child class object
		 * then it will consider child class variable only
		 * */
		//System.out.println(obj.employeeID);
		
		obj.displayVariablesfromParentAndChild();
		
		//below it takes parent class variable but not child class
		//as we created obj for parent class only
//		ParentClass parentObj =  new ParentClass();
//		System.out.println(parentObj.employeeID);

	}
	
	public void displayStdId(int stdID){
		System.out.println(stdID);
	}
	
	public void displayVariablesfromParentAndChild(){
		System.out.println(this.employeeID); //this indidates current class object
		System.out.println(super.employeeID); //super indicate parent class object
	}
	
	
	

}
