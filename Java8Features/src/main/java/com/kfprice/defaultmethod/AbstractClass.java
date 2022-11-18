package com.kfprice.defaultmethod;

public abstract class AbstractClass {
	
	public AbstractClass() {
		System.out.println("You can create a constructor in an abstract class.");
		
	}
	
	abstract int add(int a, int b);
	int sub(int a, int b) {
		return a-b;
	}
	static int multiply(int a, int b) {
		return a*b;
	}
	
	
	  

}
