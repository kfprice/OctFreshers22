package com.kfprice.functional;


public interface Doable {
	
	default void doIt() {
		System.out.println("Do it now");
	}

}
