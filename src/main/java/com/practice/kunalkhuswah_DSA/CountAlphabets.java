package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class CountAlphabets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int ans = countAlphabets(n, str);
        System.out.println(ans);
	}
	
	static int countAlphabets(int n, String str) {
		int count = 0;
		str = str.toLowerCase();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				count++;
			}
		}
		
        return count;
    }
}
