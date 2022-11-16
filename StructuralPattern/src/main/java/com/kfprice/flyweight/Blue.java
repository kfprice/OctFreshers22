package com.kfprice.flyweight;

public class Blue implements Player{
	
	private final String TASK;
	
	private String weapon;
	
	public Blue() {
		TASK = "Strike Red Team";
	}

	@Override
	public void assignWeapon(String weapon) {
		this.weapon = weapon;
		
	}

	@Override
	public void mission() {
		System.out.println("Blue Team with weapon " + weapon + "|" + " Task is " + TASK);
		
	}

}
