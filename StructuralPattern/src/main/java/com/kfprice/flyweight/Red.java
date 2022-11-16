package com.kfprice.flyweight;

public class Red implements Player{
	
	private final String TASK;
	
	private String weapon;
	
	public Red() {
		TASK = "Strike Blue Team";
	}

	@Override
	public void assignWeapon(String weapon) {
		this.weapon = weapon;
		
	}

	@Override
	public void mission() {
		System.out.println("Red Team with weapon " + weapon + "|" + " Task is " + TASK);
		
	}
}
