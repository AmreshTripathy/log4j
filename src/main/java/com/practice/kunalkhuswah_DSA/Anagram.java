package com.practice.kunalkhuswah_DSA;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class Anagram {
	
	protected static Scanner sc = new Scanner(System.in);
	public static boolean isAnagram(String s, String t) {
		String[] s_arr = s.split("");
		String[] t_arr = t.split("");
		Arrays.sort(s_arr);
		Arrays.sort(t_arr);
		if(Arrays.equals(s_arr, t_arr)){
			return true;
		}
        return false;
    }
	
	public static void main(String[] args) {
		System.out.println(isAnagram(sc.next(), sc.next()));
	}
}
