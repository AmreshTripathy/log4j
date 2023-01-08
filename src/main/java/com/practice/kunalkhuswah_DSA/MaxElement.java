package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * @Amresh Tripathy
 */

public class MaxElement {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Matcher m = matches(sc.nextLine(), "(\\d+)");
		int max = 0;
		while(m.find()) {
			int num = Integer.parseInt(m.group());
			if(max < num) {
				max = num;
			}
		}
		
		System.out.println(max);
	}
	
	private static Matcher matches(String x, String y) {
		Pattern pattern = Pattern.compile(y);
		Matcher m = pattern.matcher(x);
		
		return m;
	}
}
