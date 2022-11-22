package com.kfprice.typeinterface;

public class GenericClass<X> {
	X name;
	public void setName(X name) {
		this.name = name;
	}
	public X getName() {
		return name;
	}
	public String genericMethod(GenericClass<String> x) {
		x.setName("Bruce");
		return x.name;
	}

}
