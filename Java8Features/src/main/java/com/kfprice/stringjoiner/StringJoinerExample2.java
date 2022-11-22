package com.kfprice.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerExample2 {

	public static void main(String[] args) {
		
		StringJoiner joinNames = new StringJoiner(", ");
		
		System.out.println(joinNames);
		
		joinNames.setEmptyValue("It is empty");
		System.out.println(joinNames);
		
		joinNames.add("Steve");
		joinNames.add("Tony");
		System.out.println(joinNames);
		
		int length = joinNames.length();
		System.out.println("Length: "+length);
		
		String str = joinNames.toString();
		System.out.println(str);
		
		char ch = str.charAt(3);
		System.out.println("Character at index 3: "+ch);
		
		joinNames.add("Bruce");
		System.out.println(joinNames);
		
		int newLength = joinNames.length();
		System.out.println("New Length: "+newLength);

	}

}
