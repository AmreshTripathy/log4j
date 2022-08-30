package com.practice.java_practice;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class Vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if(str.toLowerCase().matches(".*[a,e,i,o,u].*")) {
			System.out.println(true);
		}
	}

}
