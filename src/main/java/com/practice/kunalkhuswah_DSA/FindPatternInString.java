package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindPatternInString {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print(isMatch(sc.next(), sc.next()));
	}
	
	private static String isMatch(String x, String y){
		Pattern p = Pattern.compile(x);
		Matcher m = p.matcher(y);
		
		if(m.find()) {
//			System.out.println(m.group());
			return "YES";
		}
		
       return "NO";
	}
}
