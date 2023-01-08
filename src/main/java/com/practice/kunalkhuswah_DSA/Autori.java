package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class Autori {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String str = sc.next();
        String[] s = str.split("-");
        for(int i = 0; i < s.length; i++)
            System.out.print(s[i].charAt(0));
	}
}
