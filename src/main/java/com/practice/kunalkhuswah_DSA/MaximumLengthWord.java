package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumLengthWord {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(maxWord(sc.nextLine()));
	}
	private static String maxWord(String str) {
		
		String[] arr = str.split(" ");
		int max_length = 0;
		Map<Integer, String> map = new HashMap<Integer, String>();
		for(String s : arr){
			if(max_length < s.length()) {
				max_length = s.length();
				map.put(max_length, s);
			}
		}
		
		return map.get(max_length);
	}
}
