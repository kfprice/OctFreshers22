package com.kfprice.mediator;

public class MediatorPatternDemo {

	public static void main(String[] args) {
		
		ApnaChatRoom chat = new ApnaChatRoomImpl();
		
		User1 u1 = new User1(chat);
		u1.setname("Tanner");
		u1.sendMsg("Hi Murat! How are you?");
		
		User2 u2 = new User2(chat);
		u2.setname("Murat");
		u2.sendMsg("I'm great! And you?");

	}

}
