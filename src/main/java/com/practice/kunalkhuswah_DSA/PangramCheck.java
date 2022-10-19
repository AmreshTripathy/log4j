package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class PangramCheck {
	
	protected static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		String input = sc.nextLine();
		input = input.replaceAll(" ", "").toLowerCase();
		System.out.println(isPanagram(input));
	}
	private static String isPanagram(String input) {
		if(input.length() < 26) {
			return "NO";
		}else {
			for(char ch = 'a'; ch <= 'z'; ch++) {
				if(input.indexOf(ch) < 0) {
					return "NO";
				}
			}
		}
		return "YES";
	}
}
