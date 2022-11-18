package com.kfprice.defaultmethod;

public class DefaultMethods2 implements Sayable{
	
	public void sayMore(String msg) {
		System.out.println(msg);
		
	}

	public static void main(String[] args) {
		DefaultMethods2 dm = new DefaultMethods2();
		dm.say();
		dm.sayMore("My name is");
		Sayable.sayLouder("Kemet!");

	}

}
