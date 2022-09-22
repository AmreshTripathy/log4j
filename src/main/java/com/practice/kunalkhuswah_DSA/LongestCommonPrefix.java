package com.practice.kunalkhuswah_DSA;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class LongestCommonPrefix {

	protected static Scanner sc = new Scanner(System.in);
	
	 public static String longestCommonPrefix(String[] strs) {
		 if(strs.length == 0)
			 return "";
		 Arrays.sort(strs);
		 int min_size = Math.min(strs[0].length(), strs[strs.length-1].length());
		 
		 int i = 0;
		 while(i < min_size && strs[0].charAt(i) == strs[strs.length-1].charAt(i)) {
			 i++;
		 }
		 return new String(strs[0].substring(0, i));
	 }
	 
	 public static void main(String[] args) {
		 String[] str = new String[3];
		 for(int i = 0; i < str.length; i++)
			 str[i] = sc.next();
		 System.out.println(longestCommonPrefix(str));
	}
}
