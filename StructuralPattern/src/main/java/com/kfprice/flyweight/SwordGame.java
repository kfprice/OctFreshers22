package com.kfprice.flyweight;

import java.util.Random;

public class SwordGame {
	
	private static String[] playerType = {"Red","Blue"};
	private static String[] weapons = {"Sword", "Dagger","Shield","Mace"};
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			Player p = PlayerFactory.getPlayer(getRandPlayerType());
			
			p.assignWeapon(getRandWeapon());
			
			p.mission();
		}
	}
	
	public static String getRandPlayerType() {
		Random r = new Random();
		
		int randInt = r.nextInt(playerType.length);
		
		return playerType[randInt];
	}
	
	public static String getRandWeapon() {
		Random r = new Random();
		
		int randInt = r.nextInt(weapons.length);
		
		return weapons[randInt];
	}

}
