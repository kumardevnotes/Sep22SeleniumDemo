package com.arrays;

import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {

		int stdID = 1122;
		int[] stdIds = { 100, 101, 102 }; // stdIds[0] stdIds[1]... stdIds[length-1]
		String[] cities = {"hyd", "pune"}; 
		
		 //Declared array size
		// excess data issue or less amount data
		//stores only sta tyoe of data

		for (int i = 0; i < stdIds.length; i++) { //initialization; condition; inc/dec
			//2; 2 < 3;
			System.out.println(stdIds[i]); //stdIds[2]--> 102
		}
		
		for (int i = stdIds.length-1; i >= 0; i--) { //initialization; condition; inc/dec
			
			System.out.println(stdIds[i]); //stdIds[2]--> 102
		}
		
		int employeeIds[] = new int[5]; //0,1,2,3,4,5
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i <= employeeIds.length-1; i++) {
			System.out.println("Please enter employeeID");
			employeeIds[i] = scan.nextInt(); 
		}
		
		System.out.println("Employee IDs");
		
		for(int i=0; i <= employeeIds.length-1; i++) {	
			System.out.println(employeeIds[i]);
		}

	}

}
