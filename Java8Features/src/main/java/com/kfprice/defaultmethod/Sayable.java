package com.kfprice.defaultmethod;

public interface Sayable {
	
	default void say(){
		System.out.println("Hello, this is a default method.");
	}
	
	void sayMore(String msg);
	
	static void sayLouder(String msg) {
		System.out.println(msg);
	}

}
