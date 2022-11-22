package com.kfprice.typeinterface;

public class TypeInterfaceExample2 {

	public static void main(String[] args) {
		
		GenericClass<String> genericClass = new GenericClass<String>();
		genericClass.setName("Han");
		System.out.println(genericClass.getName());
		
		GenericClass<String> genericClass2 = new GenericClass<>();
		genericClass2.setName("Luke");
		System.out.println(genericClass2.getName());
		
		System.out.println(genericClass2.genericMethod(new GenericClass<>()));

	}

}
