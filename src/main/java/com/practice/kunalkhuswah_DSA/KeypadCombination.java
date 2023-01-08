package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class KeypadCombination {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        sc.close();
        printKPC(str, "", 0);
	}
	
	protected static String[] arr = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
	
	static void printKPC(String ques, String ans, int index) {
		if(index == ques.length()) {
			System.out.println(ans);
			return;
		}
		
		int num = ques.charAt(index) - '0';
		
		for(int i = 0; i < arr[num].length(); i++) {
			printKPC(ques, ans + arr[num].charAt(i), index+1);
		}
    }
}
