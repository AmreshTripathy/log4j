package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class CamelCaseWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		printCamelCase(sc.next());
		sc.close();
	}

	private static void printCamelCase(String s) {
		for(int i = 0; i < s.length(); i++){

			if(i+1 < s.length() && 
					Character.isUpperCase(s.charAt(i)) && Character.isUpperCase(s.charAt(i+1))){
				System.out.print(s.charAt(i) + "\n");
			}else if(i+1 < s.length() && 
					Character.isLowerCase(s.charAt(i)) && Character.isUpperCase(s.charAt(i+1))) {
				System.out.print(s.charAt(i) + "\n");
			}else{
				System.out.print(s.charAt(i));
			}
		}
	}
}
