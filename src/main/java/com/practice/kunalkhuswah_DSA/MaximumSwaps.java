package com.practice.kunalkhuswah_DSA;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class MaximumSwaps {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		maximumSwap(n);
		sc.close();
	}

	private static void maximumSwap(int num) {
		
		String s = String.valueOf(num);
		
		char[] arr = s.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			int index = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[index] <= arr[j]) {
					index = j;
				}
			}
			
			if(index != i && arr[index] != arr[i]) {
				char ch = arr[i];
				arr[i] = arr[index];
				arr[index] = ch;
				break;
			}
		}
		
		System.out.print(Integer.parseInt(new String(arr)));
		
	}
}
