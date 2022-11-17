package com.kfprice.functional;

@FunctionalInterface
public interface Sayable extends Doable{
	
	void say(String msg);

}
