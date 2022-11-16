package com.kfprice.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FacadePatternClient {
	
	private static int choice;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		do {
			System.out.print("========== Mobile Shop ==========\n");
			System.out.print("     1. iPhone.       \n");
			System.out.print("     2. Samsung.        \n");
			System.out.print("     3. Google.          \n");
			System.out.print("     4. Exit.         \n");
			System.out.print("Enter your choice: ");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());
			ShopKeeper sk = new ShopKeeper();
			
			switch(choice) {
			case 1:{
				sk.iphoneSale();
			}
				break;
			case 2:{
				sk.samsungSale();
			}
				break;
			case 3:{
				sk.googleSale();
			}
				break;
			  default:{
				  System.out.println("You purchased nothing...");
			  }
			  return;
			}
		}while(choice!=4);
	}

}
