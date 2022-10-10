package com.inheritance;

public class ParentClass {
	
	//instance vareiable
	int employeeID =  5566;
	
	public void displaySchoolName(String school) {
		System.out.println(school);
	}
	
	private void displaySchoolAnnaulIncome() {
		System.out.println(10000);
	}
	
	protected void displaySchoolTutionFee() {
		System.out.println(1000);
	}
	
	public final void displayLogo() {
		System.out.println("Model School logo displayed");
	}
}
