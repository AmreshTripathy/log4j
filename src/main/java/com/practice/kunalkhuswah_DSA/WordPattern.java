package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pattern = sc.nextLine();
		String s = sc.nextLine();
		System.out.print(wordPattern(pattern, s));
		sc.close();
	}

	private static boolean wordPattern(String pattern, String s) {
		
		String[] arr = s.split(" ");
		
		if(pattern.length() != arr.length) return false;
		
		Map<Character, String> map = new HashMap<Character, String>();
		Map<String, Character> alt_map = new HashMap<String, Character>();
		
		
		for(int i = 0; i < pattern.length(); i++) {
			if(!map.containsKey(pattern.charAt(i)) && !alt_map.containsKey(arr[i])) {
				map.put(pattern.charAt(i), arr[i]);
				alt_map.put(arr[i], pattern.charAt(i));
			}else {
				if(map.containsKey(pattern.charAt(i)) && !map.get(pattern.charAt(i)).equals(arr[i]))
					return false;
				if(alt_map.containsKey(arr[i]) && !alt_map.get(arr[i]).equals(pattern.charAt(i)))
					return false;
			}
		}
		
		return true;
	}
}
