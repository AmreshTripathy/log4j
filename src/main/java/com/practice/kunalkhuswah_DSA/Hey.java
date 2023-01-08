package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class Hey {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String str = sc.next();
		
		int count = 0;
		for(int i = 1; i < str.length()-1; i++) {
			if(str.charAt(i) == 'e') {
				count++;
			}
		}
		System.out.print("h");
		for(int i = 1; i <= 2 * count; i++) {
			System.out.print("e");
		}
		System.out.print("y");
	}
}
