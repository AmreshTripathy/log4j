package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class ExcelColumnSheetModified {
protected static Scanner sc = new Scanner(System.in);
	
	public static String convertToTitle(int columnNumber) {
		StringBuilder ans=new StringBuilder();

		  while(columnNumber!=0){

		        if (columnNumber%26==0) {
		            ans.append('Z');
		            columnNumber = (columnNumber / 26)-1;
		        }
		        else {
		            char converter = (char) ((columnNumber%26) + 64);
		            ans.append(converter);
		            columnNumber = columnNumber / 26;
		        }

		    }
			ans.reverse();
		return ans.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(convertToTitle(sc.nextInt()));
	}
}
