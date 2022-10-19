package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * @Amresh Tripathy
 */

public class RansomeNote {
	protected static Scanner sc = new Scanner(System.in);
	
	 public static boolean canConstruct(String ransomNote, String magazine) {
		 Pattern p = Pattern.compile("("+ransomNote+")");//. represents single character  
	     Matcher m = p.matcher(magazine);
//	     m.matches(); 
		 if(m.find()) {
			 return true;
		 }
		 return false;
	 }
	
	public static void main(String[] args) {
		System.out.println(canConstruct(sc.next(), sc.next()));
	}
}
