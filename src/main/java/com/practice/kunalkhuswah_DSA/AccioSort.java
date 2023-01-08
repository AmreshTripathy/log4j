package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class AccioSort {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String str = sc.nextLine();
        String ans = sentenceSorting(str);
        System.out.println(ans);
	}
	
	private static String sentenceSorting(String str) {
		String[] arr = str.split(" ");
		String[] arr_str = new String[arr.length];
		
		for(String s : arr) {
			int pos = s.charAt(s.length()-1) - '0';
			arr_str[pos-1] = s.substring(0, s.length()-1);
		}
		
        return String.join(" ", arr_str);
    }
}
