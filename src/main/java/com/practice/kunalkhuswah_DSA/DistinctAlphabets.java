package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DistinctAlphabets {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String str = sc.nextLine();
		printAlphabets(str);
	}

	static void printAlphabets(String str) {
		str = str.replaceAll(" ", "").toLowerCase();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		
		for(char i = 'a'; i <= 'z'; i++) {
			if(map.containsKey(i)) {
				System.out.print(map.get(i) + " ");
			}else {
				System.out.print(0 + " ");
			}
		}
	}
}
