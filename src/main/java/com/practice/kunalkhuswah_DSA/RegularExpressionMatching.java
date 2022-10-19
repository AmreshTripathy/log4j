package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;
import java.util.regex.*;

/*
 * @Amresh Tripathy
 */

public class RegularExpressionMatching {
	
	protected static Scanner sc = new Scanner(System.in);
	public static boolean isMatch(String s, String p) {
		
//		Pattern x = Pattern.compile("");
		
        return Pattern.matches(p,s);
    }
	
	public static void main(String[] args) {
		System.out.println(isMatch(sc.next(), sc.next()));
	}
}
