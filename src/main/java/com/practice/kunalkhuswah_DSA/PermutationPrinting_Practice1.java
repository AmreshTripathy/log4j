package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class PermutationPrinting_Practice1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		scn.close();
		permutationPrint(s, "");
	}

	private static void permutationPrint(String s, String ans) {
		if(s.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		for(int i = 0; i < s.length(); i++) {
			String mod_s = s.substring(0, i) + s.substring(i + 1);
			permutationPrint(mod_s, ans + s.charAt(i));
		}
	}
}
