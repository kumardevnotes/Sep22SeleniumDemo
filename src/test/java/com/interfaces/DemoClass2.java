package com.interfaces;

public class DemoClass2 implements DemoInterface{

	public static void main(String[] args) {
		
		DemoClass2 DCObj2 = new DemoClass2();
		DCObj2.displayMessage();
		DCObj2.displayMessage("This message is from DemoClass2");
	}
	

	public void displayMessage() {
		System.out.println("I am displayMessage() from DemoClass2");
	}

	public void displayMessage(String myMessage) {
		System.out.println("Cusom message " + myMessage);
	}

}
