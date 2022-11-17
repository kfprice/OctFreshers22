package com.kfprice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionExample9 {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "iPhone 14", 999f));
		list.add(new Product(3, "Samsung Galaxy s20", 799f));
		list.add(new Product(2, "Google Pixel 6a", 599f));
		list.add(new Product(4, "ROG Phone 6", 1599f));
		list.add(new Product(5, "iPhone SE", 299f));
		list.add(new Product(6, "Google Pixel 5", 399f));
		
		Stream<Product> filtered_data = list.stream().filter(p -> p.price < 400);
		
		filtered_data.forEach(
				product -> System.out.println(product.name+": "+product.price)
				);

	}

}
