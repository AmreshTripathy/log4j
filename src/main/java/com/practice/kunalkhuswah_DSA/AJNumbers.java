package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class AJNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder str = new StringBuilder(sc.next());
        
        solve(str,n);

        sc.close();
	}

	private static void solve(StringBuilder str, int n) {
		int max = 0;
		
		max = countPrime(str.toString());
		System.out.println(max);
	}

	private static int countPrime(String str) {
		
		if(str.isEmpty()) 
			return 0;
		
		int ans = 0;
		for(int i = 0; i < str.length(); i++) {
			long num = Long.parseLong(str.substring(0, i + 1));
			int count = 0;
			if(check(num)) {
				System.out.println(num);
				count = 1;
			}
			int b = count + countPrime(str.substring(i + 1));
			ans = Integer.max(ans, b);
		}
		
		return ans;
	}

	private static boolean check(long num) {
		long[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
		
		for(long a: arr) {
			if(num == a) return true;
			if(num % a == 0) return false;
		}
		
		return (num == 1 || num == 0) ? false : true;
	}
}
