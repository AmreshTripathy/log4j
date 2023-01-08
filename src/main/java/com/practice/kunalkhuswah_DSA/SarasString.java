package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class SarasString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        String s = input.next();
        input.close();
        System.out.println(minOperation(s));
	}
	
	private static int minOperation(String s){
		
		int lowerCaseCount = 0;
		int upperCaseCount = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				upperCaseCount++;
			}else {
				lowerCaseCount++;
			}
		}
		
		return Math.min(lowerCaseCount, upperCaseCount);
    }
}
