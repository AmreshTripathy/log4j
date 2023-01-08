package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class RecursiveFibonacci {
	public static int fib(int n){
		if(n == 1) return 0;
		if(n == 2) return 1;
		int value = fib(n-1) + fib(n-2);
		return value;
//        int count = 2;
//		int i = 0;
//		int j = 1;
//		int num = 0;
//		return  numOnFib(count, n, i, j, num);
    }

	private static int numOnFib(int count, int n, int i, int j, int num) {
		if(n == 1 || n == 2)
			return n-1;
		num = i + j;
		i = j;
		j = num;
		count += 1;
		return (count == n) ? num : numOnFib(count, n, i, j, num);
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(fib(n));
    }
}
