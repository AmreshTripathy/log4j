package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ReverseWordString_III {
	
	protected static Scanner sc = new Scanner(System.in);
	
	public static String reverseWords(String s) {
		
		String rev_s = "";
		String final_String = "";
		String space_after_string = "";
		boolean space_datected = false;
		
		for(int i = s.length()-1;i >=0;i--) {
			rev_s += s.charAt(i);
			if(rev_s.endsWith(" ")) {
				if(!(space_after_string.isBlank())) {
					final_String = " " + space_after_string + final_String;
					space_after_string = "";
				}else {
					final_String = " " + final_String;
				}
				space_datected = true;
			}else if(space_datected) {
				space_after_string += rev_s;
				if(i == 0) {
					final_String = space_after_string + final_String;
				}
			}else {
				final_String += rev_s;
			}
			rev_s = "";
		}
		
		
		return final_String;
	}

	public static void main(String[] args) {
		System.out.println(reverseWords(sc.nextLine()));
	}
}
