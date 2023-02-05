package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ConvertToPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		sc.close();
		int ans = solve(A);
		System.out.println(ans);
	}

	public static int solve(String A) {

		int count = 0;

		int n = A.length();
		for(int i = 0; i < n / 2;  i++)
			if(A.charAt(i) != A.charAt(n - i - 1))
				count++;

		if(count > 1)
			return 0;
		
		return 1;
	}
}
