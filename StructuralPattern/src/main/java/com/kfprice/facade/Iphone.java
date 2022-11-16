package com.kfprice.facade;

public class Iphone implements MobileShop {
	
	@Override
	public void modelNo() {
		System.out.println(" iPhone 14 Pro");
	}
	@Override
	public void price() {
		System.out.println(" $1500.00");
	}

}
