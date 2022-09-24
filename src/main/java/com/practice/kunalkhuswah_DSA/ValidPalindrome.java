package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

/*
 * @Amresh Tripathy
 */

public class ValidPalindrome {
	protected static Scanner sc = new Scanner(System.in);
	
	public static boolean isPalindrome(String s) {
		String removed_alphanumerical_string = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		if(StringUtils.equalsIgnoreCase(removed_alphanumerical_string, (new StringBuilder(removed_alphanumerical_string).reverse().toString()))) {
			return true;
		}
		return false;
    }
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(sc.nextLine()));
	}
}
