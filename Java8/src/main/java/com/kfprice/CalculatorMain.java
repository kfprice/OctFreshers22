package com.kfprice;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Integer ans = calculator.calc((x,y)->x+y,10,5);
		System.out.println(ans);

	}

}
