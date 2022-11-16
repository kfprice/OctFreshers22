package com.kfprice.flyweight;

import java.util.HashMap;

public class PlayerFactory {
	
	private static HashMap <String, Player> hm = new HashMap<String, Player>();
	
	public static Player getPlayer(String type) {
		Player p = null;
		
		if(hm.containsKey(type)) p = hm.get(type);
		else {
			switch(type) {
			case "Red":
				System.out.println("Red Created");
				p = new Red();
				break;
			case "Blue":
				System.out.println("Blue Created");
				p = new Blue();
				break;
			default:
				System.out.println("Unreachable Code!");
			}
			
			hm.put(type, p);
		}
		return p;
	}

}
