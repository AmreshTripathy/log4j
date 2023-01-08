package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Character_Frequencies {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		characterFrequencies(sc.next());
		sc.close();
	}

	private static void characterFrequencies(String s) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(int i = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}else {
				map.put(s.charAt(i), 1);
			}
		}
		
		System.out.println(map.keySet().size());
		
		for(char ch: map.keySet()) {
			System.out.print(map.get(ch) + " ");
		}
	}
}
