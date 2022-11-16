package com.kfprice.reference;

public class InstanceMethodReferenceMain {

	public static void main(String[] args) {
		InstanceInterface instanceInterface = () -> {System.out.println("Welcome");};
		instanceInterface.myInterface();
		InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
		InstanceInterface instanceInterface2 = instanceMethodReference::saySomething;
		instanceInterface2.myInterface();

	}

}
