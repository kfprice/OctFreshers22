package com.kfprice.methodref;

public class MethodReference {

	public static void saySomething() {
		System.out.println("Hello, this is a static method.");
	}
	
	public static void main(String[] args) {
		
		Sayable sayable = MethodReference::saySomething;
		
		sayable.say();
		

	}

}
