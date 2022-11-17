package com.kfprice.functional;

public class FunctionalInterfaceExample2 implements Sayable{

	
	public void say(String msg) {
		
		System.out.println(msg);
		
	}
	
	public static void main(String[] args) {
		FunctionalInterfaceExample2 fie = new FunctionalInterfaceExample2();
		fie.say("Hello There.");

	}


	

}
