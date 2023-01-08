package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ReverseWordString_III_Modified {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(reverseWords(sc.nextLine()));
	}

	private static String reverseWords(String str) {

		StringBuilder sb = new StringBuilder();
		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				sb.append((new StringBuilder(arr[i])).reverse().toString());
				sb.append(" ");
			}else {
				sb.append(arr[i]);
				sb.append(" ");
			}
		}
		return sb.toString().trim();
	}
}
