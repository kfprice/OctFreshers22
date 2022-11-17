package com.kfprice;

public class LambdaExpressionExample2 {

	public static void main(String[] args) {
		
		Sayable s1 = (name) -> {
			return "Hello, " +name;
		};
		System.out.println(s1.say("Something"));
		
		Sayable s2 = name ->{
			return "Hello, " +name;
		};
		System.out.println(s2.say("More"));
		
	}

}
