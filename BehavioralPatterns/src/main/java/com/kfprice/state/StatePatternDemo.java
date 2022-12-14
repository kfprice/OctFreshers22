package com.kfprice.state;

public class StatePatternDemo {
	
	Controller controller;
	public StatePatternDemo(String con) {
		controller = new Controller();
		if(con.equalsIgnoreCase("management"))
		  controller.setManagementConnection();
		if(con.equalsIgnoreCase("sales"))
		  controller.setSalesConnection();
		if(con.equalsIgnoreCase("accounting"))
		  controller.setAccountingConnection();
		controller.open();
		controller.log();
		controller.close();
		controller.update();
	}

	public static void main(String[] args) {
		
		new StatePatternDemo("accounting");

	}

}
