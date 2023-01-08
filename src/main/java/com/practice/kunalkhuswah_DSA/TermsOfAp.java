package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class TermsOfAp {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int count = 1;
		int i = 1;
		while(count <= n) {
			int ele = 3 * i + 2;
			if(ele % 4 != 0) {
				System.out.print(ele + " ");
				count++;
			}
			i++;
		}
	}
}
