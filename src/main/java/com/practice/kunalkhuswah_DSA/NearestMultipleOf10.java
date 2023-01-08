package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class NearestMultipleOf10 {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		System.out.println(roundToNearest(n));
	}
	
	private static int roundToNearest(int n) {
        int num = (n/10) * 10;
        if(n-num > 5) {
        	return num+10;
        }
        return num;
    }
}
