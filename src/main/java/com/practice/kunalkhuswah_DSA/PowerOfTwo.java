package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class PowerOfTwo {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(sc.nextInt()));
	}

	public static boolean isPowerOfTwo(int n) {

		if (n == 1) {
			return true;
		}else if(n % 2 != 0 || n == 0){
			return  false;
		}
		return isPowerOfTwo(n/2);
	}
}
