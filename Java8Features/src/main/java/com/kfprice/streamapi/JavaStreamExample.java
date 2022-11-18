package com.kfprice.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaStreamExample {

	public static void main(String[] args) {
		
		List<Product> productList = new ArrayList<Product>();
		
		productList.add(new Product(1, "HP Laptop", 450f));
		productList.add(new Product(2, "Dell Laptop", 500f));
		productList.add(new Product(3, "Lenovo Laptop", 550f));
		productList.add(new Product(4, "ASUS Laptop", 600f));
		productList.add(new Product(5, "ACER Laptop", 650f));
		
		productList.stream().filter(p -> p.price>575).map(pm -> pm.price).forEach(System.out::println);
		

	}

}
