package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class CapitalizeEveryFirstIndexOfWordInAString {
    protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
        String str = sc.nextLine();
		System.out.println(Accio.capitalizeFirstLetter(str));
    }
}

class Accio {
    public static String capitalizeFirstLetter(String str) {
    	String[] arr = str.split(" ");
    	StringBuilder sb = new StringBuilder();
    	
    	for(String s: arr) {
    		sb.append(s.substring(0, 1).toUpperCase());
    		sb.append(s.substring(1, s.length()) + " ");
    	}
    	
    	return sb.toString().trim();
    }
}
