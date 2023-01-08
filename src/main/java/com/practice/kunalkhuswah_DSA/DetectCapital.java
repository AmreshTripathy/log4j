package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class DetectCapital {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		sc.close();
		System.out.println(detectCapitalUse(word));
	}

	private static boolean detectCapitalUse(String word) {
		
		String upper = word.toUpperCase();
		String lower = word.toLowerCase();
		String capital = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
		
		return (upper.equals(word) || lower.equals(word) || capital.equals(word)) ? true : false;
	}
}
