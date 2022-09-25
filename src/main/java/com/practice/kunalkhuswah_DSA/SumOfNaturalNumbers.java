package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class SumOfNaturalNumbers {
	
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		 int a = sc.nextInt();
	     int count = 0;
	     for(int i = 1; i <= a; i++) {
	       count += i;
	     }
	     System.out.println(count);
	}
}
