package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class NumberOfWaysToFormNaturalNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
//		System.out.println(ways(n, 1));
		System.out.println(ways(n, 1, 0, ""));
	}

//	public static long ways(int n, int i) {
//		
//		if(n == 0)
//			return 1;
//		if(i > n || n < 0) 
//			return 0;
//		
//		long count_with_i = ways(n - i, i + 1);
//		long count_without_i = ways(n, i + 1);
//		
//		return count_with_i + count_without_i;
//	}
//	
	public static long ways(int n, int i, int sum, String s){
		if(i == n+1) {
			if(sum == n) {
				System.out.println(s);
				s = "";
				return 1;
			}
			return 0;
		}
		if(i > n || sum > n || n < 0) 
			return 0;
		
		long count_with_i = ways(n, i+1, sum+i, s + i);
		long count_without_i = ways(n, i+1, sum, s);
		
		return count_with_i + count_without_i;
    }
}
