package com.kfprice;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample5 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Anakin");
		list.add("Obi-Wan");
		list.add("Darth Moul");
		list.add("Han");
		
		list.forEach(
			(n)->System.out.println(n)	
				);
	}

}
