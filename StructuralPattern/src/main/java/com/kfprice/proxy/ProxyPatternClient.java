package com.kfprice.proxy;

public class ProxyPatternClient {

	public static void main(String[] args) {
		OfficeInternetAccess access = new ProxyInternetAccess("Kemet Price");
		access.grantInternetAccess();

	}

}
