package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Arrays;
import java.util.Scanner;

public class SortTheStringDescendingOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(solve(sc.next()));
		sc.close();
	}

	private static String solve(String S) {
		char[] ch = S.toCharArray();
		
		Arrays.sort(ch);
		int n = ch.length;
		
		for(int i = 0; i < n/2; i++) {
			char temp = ch[i];
			ch[i] = ch[n-1-i];
			ch[n-1-i] = temp;
		}
		
		return new String(ch);

	}
}
