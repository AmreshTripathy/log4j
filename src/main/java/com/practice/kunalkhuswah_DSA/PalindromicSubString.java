package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PalindromicSubString {
	private static void palindromeSubStrs(String s) {
        
		Set<String> set = new HashSet<String>();
		
		for(int i = 0; i < s.length(); i++) {
			StringBuilder sb = new StringBuilder();;
			sb.append(s.charAt(i));
			if(!set.contains(sb.toString()))
				set.add(sb.toString());
			for(int j = i+1; j < s.length(); j++) {
				sb.append(s.charAt(j));
				if(sb.toString().equals((new StringBuilder(sb)).reverse().toString())) {
					if(!set.contains(sb.toString()))
						set.add(sb.toString());
				}
			}
		}
		
		List<String> lis = new ArrayList<String>(set);
		Collections.sort(lis);
		
		for(String str: lis) {
			System.out.println(str);
		}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        palindromeSubStrs(s);
    }
}
