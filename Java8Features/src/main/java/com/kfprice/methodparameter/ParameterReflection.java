package com.kfprice.methodparameter;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParameterReflection {

	public static void main(String[] args) {
		
		Calculate calculate = new Calculate();
		
		Class cls = calculate.getClass();
		
		Method[] method = cls.getDeclaredMethods();
		
		for(Method method2 : method) {
			System.out.print(method2.getName());
			
			Parameter parameter[] = method2.getParameters();
			
			for(Parameter parameter2 : parameter) {
				System.out.print(" "+parameter2.getParameterizedType());
				System.out.print(" "+parameter2.getName());
			}
			System.out.println();
		}

	}

}
