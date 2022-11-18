package com.kfprice.defaultmethod;

public class AbstractTest extends AbstractClass{
	
	
	public int add(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		
		AbstractTest a = new AbstractTest();
		int result1 = a.add(56, 87);
		int result2 = a.sub(564, 489);
		int result3 = AbstractClass.multiply(34, 56);
		System.out.println("Addition: "+result1);
		System.out.println("Subtraction: "+result2);
		System.out.println("Multiplication: "+result3);

	}

	

}
