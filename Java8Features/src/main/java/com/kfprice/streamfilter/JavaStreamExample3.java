
package com.kfprice.streamfilter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.kfprice.streamapi.Product;

public class JavaStreamExample3 {

	public static void main(String[] args) {

		List<Product2> productList = new ArrayList<Product2>();

		productList.add(new Product2(1, "HP Laptop", 450f));
		productList.add(new Product2(2, "Dell Laptop", 500f));
		productList.add(new Product2(3, "Lenovo Laptop", 550f));
		productList.add(new Product2(4, "ASUS Laptop", 600f));
		productList.add(new Product2(5, "ACER Laptop", 650f));

		List<Float> pricesList = productList.stream()
				.filter(p->p.price>400)
				.map(pm->pm.price)
				.collect(Collectors.toList());
		System.out.println(pricesList);

	}
}
