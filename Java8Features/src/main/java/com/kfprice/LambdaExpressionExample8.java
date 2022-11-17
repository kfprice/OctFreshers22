package com.kfprice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionExample8 {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<Product>();
		
		list.add(new Product(1, "HP Laptop", 700f));
		list.add(new Product(3, "iPhone 14 Pro Max", 1500f));
		list.add(new Product(2, "RTX 3080", 800f));
		
		System.out.println("Sorting on the basis of name...");
		
		Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		for(Product p:list) {
			System.out.println(p.id+" "+p.name+" "+p.price);
		}

	}

}
