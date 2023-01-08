package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class NumberIsSparseOrNot {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		String s = Integer.toBinaryString(n);
		System.out.println(s);
		System.out.print(isSparse(n));
	}
	
	static boolean isSparse(int n)
    {
        int prev;
 
        if (n == 1)
            return true;
 
        while (n > 0) {
            prev = n & 1;
            n = n >> 1;
            int curr = n & 1;
            if (prev == curr && prev == 1)
                return false;
            prev = curr;
        }
 
        return true;
    }
}
