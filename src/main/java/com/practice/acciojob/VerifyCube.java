package com.practice.acciojob;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class VerifyCube {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws java.lang.Exception {
		long a = sc.nextInt();
		long b = sc.nextInt();
		
		System.out.println(isCube(a,b));
	}
	private static String isCube(long a, long b) {
		
		long lhs = (long) Math.pow((a+b), 3);
		
		long rhs = (long) (Math.pow(a, 3) +  Math.pow(b, 3) + (3 * Math.pow(a, 2) * b) + (3 * a * Math.pow(b, 2)));
		
		if(lhs == rhs) {
			return "VERIFIED";
		}
		return "NOT VERIFIED";
	}
}
