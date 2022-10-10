package com.interfaces;

public class DemoClass1 implements DemoInterface{

	public static void main(String[] args) {
		
		DemoClass1 DCObj1 = new DemoClass1();
		DCObj1.displayNotification();
		DCObj1.displayMessage();
		DCObj1.displayMessage("This message is from DemoClass1");
	}
	
	public void displayNotification() {
		System.out.println("your having low balance!");
	}

	public void displayMessage() {
		System.out.println("I am displayMessage() from DemoClass1");
	}

	public void displayMessage(String myMessage) {
		System.out.println(myMessage);
	}

}
