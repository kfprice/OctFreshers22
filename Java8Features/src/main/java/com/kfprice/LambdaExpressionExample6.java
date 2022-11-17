package com.kfprice;

public class LambdaExpressionExample6 {

	public static void main(String[] args) {

		Sayable person = (message)->{
			String str1 = "I would like to say, ";
			String str2 = str1 + message;
			return str2;
		};
			System.out.println(person.say("May the force be with you"));

	}

}
