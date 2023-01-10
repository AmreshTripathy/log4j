package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class RemoveAllAdjacentDuplicatesInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(rremove(str));
	}
	
	private static String rremove(String s) {
		
		if(s.equals("")) return "";
		
		boolean isDuplicatePresent = false;
		
		for(int i = 0; i < s.length() - 1; i++) {
			if(s.charAt(i) == s.charAt(i + 1)) {
				isDuplicatePresent = true;
				break;
			}
		}
		
		if(isDuplicatePresent)
			return rremove(s.replaceAll("(.)\\1+", ""));
		
        return s;
    }
}
