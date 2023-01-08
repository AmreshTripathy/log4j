package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class KAnagrams {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String str_1 = sc.next();
		String str_2 = sc.next();
		
		int k = sc.nextInt();
		
		System.out.println(isAnagram(str_1, str_2, k));		
	}
	
	private static int isAnagram(String str_1, String str_2, int k) {
		
		if(str_1.length() != str_2.length()) {
			return 0;
		}
		
		int count = 0;
		for(char ch: str_1.toCharArray()) {
			if(str_2.indexOf(ch) < 0) {
				count++;
			}
		}
		
		if(count <= k) {
			return 1;
		}
		
		return 0;
	}
}
