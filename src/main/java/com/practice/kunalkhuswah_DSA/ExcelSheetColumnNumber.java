package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ExcelSheetColumnNumber {
	
	protected static Scanner sc = new Scanner(System.in);
	public static int titleToNumber(String columnTitle) {
		int count=0;
		for(int i=0;i<columnTitle.length();i++)
		{
			count*=26;
			count+=(columnTitle.charAt(i)-'A'+1);
		}
		return count;
    }
	
	public static void main(String[] args) {
		System.out.println(titleToNumber(sc.next()));
	}
}
