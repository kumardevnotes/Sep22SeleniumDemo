package com.java.methods;

public class JavaMethods {

	public static void main(String[] args) {
		JavaMethods obj  =  new JavaMethods();
		obj.displayStdID();
		obj.displayStdName("John Legend");
		obj.displayStdAddress("Hyd",  117788);
		int feeDetails = obj.getStdFeeDetails();
		System.out.println(feeDetails);
		String courseDetails  = obj.getStdCourse();
		System.out.println(courseDetails);
	}

	public void displayStdID() { // returns nothing and no params
		System.out.println(1122);
	}

	public void displayStdName(String school) {
		System.out.println(school);
	}

	public void displayStdAddress(String stdCity, int stdDoorNo) {
		System.out.println(stdCity);
		System.out.println(stdDoorNo);
	}
	
	public int getStdFeeDetails() {
		return 100; //100$
		
	}
	
	public String getStdCourse() {
		return "CSE"; 
		
	}

}
