package com.kfprice.typeinterface;

import java.util.ArrayList;
import java.util.List;

public class TypeInterfaceExample {
	
	public static void showList(List<Integer>list) {
		if(!list.isEmpty()) {
			list.forEach(System.out::println);
		} else System.out.println("list is empty");
	}

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(11);
		showList(list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(12);
		showList(list2);
		
		showList(new ArrayList<>());

	}

}
