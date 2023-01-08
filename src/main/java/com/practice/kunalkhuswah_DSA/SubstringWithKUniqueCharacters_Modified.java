package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubstringWithKUniqueCharacters_Modified {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int k = sc.nextInt();
		sc.close();

		System.out.println(findLengthOfLongestSubstringWithKUniqueCharacters(str, k));
	}

	private static int findLengthOfLongestSubstringWithKUniqueCharacters(String s, int k) {
		int n = s.length();
		int max = -1;

		int i = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int j = 0; j < n; j++) {
			char c = s.charAt(j);
			map.put(c, map.getOrDefault(c, 0) + 1);
			
			while(map.size() > k) {
				char ch = s.charAt(i);
				map.put(ch, map.get(ch) - 1); // decreasing frequency to get the character sequence in the substring
				if(map.get(ch) == 0)
					map.remove(ch);
				i++;
			}
			
			if(map.size() == k)
				max = Math.max(max, j - i + 1);
		}
		
		return max;
	}
}
