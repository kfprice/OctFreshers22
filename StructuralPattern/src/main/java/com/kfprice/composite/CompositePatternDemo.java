package com.kfprice.composite;

public class CompositePatternDemo {

	public static void main(String[] args) {
		Employee emp1 = new Cashier(101, "Murat", 57000.0);
		Employee emp2 = new Cashier(102, "Mackenzie", 67000.0);
		Employee emp3 = new Accountant(103, "Vanessa", 77000.0);
		Employee manager1 = new BankManager(100, "Kemet", 87000.0);
		
		manager1.add(emp1);
		manager1.add(emp2);
		manager1.add(emp3);
		manager1.print();

	}

}
