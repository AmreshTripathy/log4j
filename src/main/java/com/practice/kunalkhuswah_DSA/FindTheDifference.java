package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class FindTheDifference {
	protected static Scanner sc = new Scanner(System.in);
	
	public static char findTheDifference(String s, String t) {
//        t = t.replaceFirst("("+s+")","");
//        char c = 0;
		int count_s = 0;
        int count_t = 0;
//		try {
//        char[] sr_arr = s.toCharArray();
//        char[] tr_arr = t.toCharArray();
//        for(char sr : s.toCharArray()) {
////        	int flag = 0;
//        	
//        	for(char tr : t.toCharArray()) {
//        		if(tr == sr) {
//        			s = s.substring(0, count_s) + s.substring(count_s + 1);
//        			t = t.substring(0, count_t) + t.substring(count_t + 1);
//        			count_t++;
//        			break;
//        		}
//        		count_t++;
//        	}
//        	count_t = 0;
//        	count_s++;
//        }
//		}catch(IndexOutOfBoundsException e) {
//			return t.charAt(count_t-1);
//		}
        
        return t.charAt(0);
    }
	
	public static void main(String[] args) {
		System.out.println(findTheDifference(sc.next(), sc.next()));
	}
}
