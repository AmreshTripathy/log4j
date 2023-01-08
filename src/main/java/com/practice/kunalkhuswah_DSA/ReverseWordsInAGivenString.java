package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ReverseWordsInAGivenString {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(solve(sc.next()));
	}

	private static String solve(String s) {
		String[] arr = s.split("\\.");
		String[] arr_1 = new String[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			arr_1[arr.length - 1 - i] = arr[i];
		}
		return String.join(".", arr_1);
	}
}
