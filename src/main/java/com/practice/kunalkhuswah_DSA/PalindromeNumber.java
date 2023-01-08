package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class PalindromeNumber {
	 protected static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		int num = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		
		int num2 = Integer.parseInt(sb.append(Integer.toString(num)).reverse().toString());
		if(num == num2) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
//		int N = sc.nextInt();
//		int n1 = N;
//        int num = 0;
//        while(N > 0){
//            num = (num * 10) + (N % 10);
//            N /= 10;
//        }
//        if(N == num){
//        	System.out.println(true);
//        }else {
//        	System.out.println(false);
//        }

	}
}
