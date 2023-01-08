package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class RemoveCharactersFromFirstStringThatArePresentInTheSecondString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next(), s2 = sc.next();
		sc.close();
		System.out.println(Solution.removeChars(s1, s2));
	}
}


class Solution{
    public static String removeChars(String s1, String s2) {
		StringBuilder sb = new StringBuilder(s1);
		
        for(char ch : s2.toCharArray()){
            while(sb.indexOf(ch+"") >= 0){
                sb.deleteCharAt(sb.indexOf(ch+""));
            }
        }

        return sb.toString();
	}
}