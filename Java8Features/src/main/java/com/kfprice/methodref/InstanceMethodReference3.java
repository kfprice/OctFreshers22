package com.kfprice.methodref;

import java.util.function.BiFunction;

public class InstanceMethodReference3 {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, Integer>adder = new Arithmetic2()::add;
		int result = adder.apply(22, 78);
		System.out.println(result);

	}

}
