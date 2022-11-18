package com.kfprice.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsExample {

	public static void main(String[] args) {
		
		List<Product3> productsList = new ArrayList<Product3>();
		
		productsList.add(new Product3(1, "RTX 3050", 250f));
		productsList.add(new Product3(2, "RTX 3060", 300f));
		productsList.add(new Product3(3, "RTX 3070", 450f));
		productsList.add(new Product3(4, "RTX 3080", 700f));
		productsList.add(new Product3(5, "RTX 3090", 1000f));
		
		Long noOfElemets = productsList.stream().collect(Collectors.counting());
		System.out.println("Total elements: "+noOfElemets);

	}

}
