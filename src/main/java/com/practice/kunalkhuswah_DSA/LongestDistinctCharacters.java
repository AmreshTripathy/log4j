package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class LongestDistinctCharacters {
	protected static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		 String str = sc.next();
		 int len = longestUniqueSubsttr(str);
	     System.out.println(len);
	}
	
	public static int longestUniqueSubsttr(String str) {
        int max = 0;
        
        for(int i = 0; i < str.length(); i++) {
        	int count = 0;
        	for(int j = i; j < str.length()-1; j++) {
        		if(str.charAt(j) != str.charAt(j+1)) {
            		count++;
            	}else {
            		if(max < count) {
            			max = count;
            		}
            		count = 0;
            	}
        	}
        }
        
		return max == 0 ? 1 : max;
    }
}
