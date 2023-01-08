package com.practice.kunalkhuswah_DSA;

import java.util.HashSet;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class StringAndItsFrequency {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String str = sc.next();
		System.out.print(frequency(str));
	}

	private static String frequency(String str) {

		StringBuilder sb = new StringBuilder();
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			if (!set.contains(str.charAt(i))) {
				sb.append(str.charAt(i));
				int count = 1;
				for (int j = i + 1; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						count++;
					}
				}
				sb.append(count);
				set.add(str.charAt(i));
			}
		}

		return sb.toString();
	}
}
