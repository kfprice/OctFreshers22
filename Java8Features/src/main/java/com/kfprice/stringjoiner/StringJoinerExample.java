package com.kfprice.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		
		StringJoiner joinNames = new StringJoiner(", ","[","]");
		
		joinNames.add("Tanner");
		joinNames.add("Arogaya");
		
		StringJoiner joinNames2 = new StringJoiner(":","[","]");
		
		joinNames2.add("Dinesh");
		joinNames2.add("Phoung");
		
		StringJoiner merge = joinNames.merge(joinNames2);
		StringJoiner merge2 = joinNames.merge(joinNames2);
		System.out.println(merge);
		

	}

}
