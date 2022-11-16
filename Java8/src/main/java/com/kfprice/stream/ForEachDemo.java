package com.kfprice.stream;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(10, "Arun", 1010f, 'E'));
		list.add(new Employee(20, "Babu", 2020f, 'M'));
		list.add(new Employee(30, "Carol", 3030f, 'M'));
		list.add(new Employee(40, "Danny", 4040f, 'C'));
		list.add(new Employee(50, "Anthony", 5050f, 'M'));
		
		list.stream().forEach((var) -> System.out.println(var.getEmpNo()+ " " + var.getEmpName() 
		+ " " + var.getSalary()));

	}

}
