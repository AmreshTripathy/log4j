package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class SubstringWithKUniqueCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int k = sc.nextInt();
		sc.close();
		
		System.out.println(longestSubString(0, str, k, 0));
	}

	private static int longestSubString(int index,String str, int k, int max) {
		if(index == str.length()) {
			return max;
		}
		
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for(int i = index; i < str.length(); i++) {
			if(sb.indexOf(str.charAt(i)+"") < 0)
				count++;
			if(count > k) break;
			sb.append(str.charAt(i));
			if(count == k)
				max = Math.max(max, sb.length());
		}
		
		max = longestSubString(index + 1, str, k, max);
		
		return max;
	}
}
