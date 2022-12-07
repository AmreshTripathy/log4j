package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/determine-if-string-halves-are-alike/
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DetermineIfStringHalvesAreAlike {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		System.out.print(halvesAreAlike(s));
	}

	private static boolean halvesAreAlike(String s) {
		
		if(s.length() %  2 != 0)
            return false;
		
        s = s.toLowerCase();
        String s1 = s.substring(0, s.length()/2);
        String s2 = s.substring(s.length()/2);

        List<Character> lis = new ArrayList<Character>();
        Collections.addAll(lis, 'a', 'e', 'i', 'o', 'u');

        int s1_count = 0;
        int s2_count = 0;
        for(int i = 0; i < s.length()/2; i++) {
            if(lis.contains(s1.charAt(i)))
                s1_count++;
            if(lis.contains(s2.charAt(i)))
                s2_count++;
        }

        if(s1_count == s2_count){
            return true;
        }

        return false;
	}
}
