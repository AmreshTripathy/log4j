package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class PowerOfTwoInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		if(check(n)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	}

	private static boolean check(int n) {
		
		if (n <= 1)
	        return true;
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			double d = Math.log(n) / Math.log(i);
			
			if((int) d == d && d > 1) {
				return true;
			}
		}
		return false;
	}
}
