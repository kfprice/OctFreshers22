package com.kfprice.facade;

public class ShopKeeper {
	
	private MobileShop iphone;
	private MobileShop samsung;
	private MobileShop google;
	
	public ShopKeeper() {
		iphone = new Iphone();
		samsung = new Samsung();
		google = new Google();
	}
	
	public void iphoneSale() {
		iphone.modelNo();
		iphone.price();
	}
	public void samsungSale() {
		samsung.modelNo();
		samsung.price();
	}
	public void googleSale() {
		google.modelNo();
		google.price();
	}

}
