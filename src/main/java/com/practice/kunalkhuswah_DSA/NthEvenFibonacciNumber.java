package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class NthEvenFibonacciNumber {
	private static long NthEvenFibonacci(long n) {
		long count = 0;
		long i = 0;
		long j = 1;
		long num = 0;
        num = fibonnaci(count , n, i, j, num);
        
        if(num > 1000000007)
        	num %= 1000000007;
        
        return num;
    }

	private static long fibonnaci(long count, long n, long i, long j,long num) {
		num = i+j;
		i = j;
		j = num;
		if(num % 2 == 0)
			count++;
		return (count == n) ? num : fibonnaci(count , n, i, j, num);
	}

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        System.out.println(NthEvenFibonacci(n));
    }
}
