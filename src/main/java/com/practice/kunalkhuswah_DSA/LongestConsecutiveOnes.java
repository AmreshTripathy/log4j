package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class LongestConsecutiveOnes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		String str = Integer.toBinaryString(n);
//		int count = 0;
//		int cur_count = 0;
//		int i = 0;
		int count = 0;
		int max = 0;
		sc.close();
		System.out.println(countMax(n, count, max));
	}
	
	private static int countMax(int n, int count, int max) {
		
		while(n > 0) {
			if(n % 2 == 1) {
				count++;
			}else {
				count = 0;
			}
			max = Math.max(count, max);
			return countMax(n/2, count, max);
		}
		return max;
	}

//	private static int countMax(String str, int i, int count, int cur_count) {
//		
//		if(i == str.length()) {
//			System.out.print(count);
//			return count;
//		}
//		
//		if(str.charAt(i) == '1') {
//			countMax(str, i+1, count, cur_count+1);
//			return count;
//		}else {
//			count = Math.max(count, cur_count);
//			cur_count = 0;
//			countMax(str, i+1, count, cur_count);
//			return count;
//		}
//	}
}
