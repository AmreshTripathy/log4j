package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ElectricityBill {

	protected static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			
			int unit = sc.nextInt();
			int modified_unit = 0;
			
			int amount = 0;
			
			if(unit > 50) {
				amount += 50 * 5;
				modified_unit = unit - 50;
			}else {
				amount = unit *5;
			}
			
			if(unit >= 50 && unit > 150) {
				amount += 100 * 7;
				modified_unit = modified_unit - 100;
			}else if(unit >= 50 && unit <= 150){
				amount += modified_unit * 7;
			}
			
			if(unit >= 150 && unit > 250) {
				amount += 100 * 9;
				modified_unit = modified_unit - 100;
			}else if(unit >= 150 && unit <= 250){
				amount += modified_unit * 9;
			}
			
			if(unit > 250) {
				amount += modified_unit * 12;
			}
			
			System.out.println(amount);
			
 		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
