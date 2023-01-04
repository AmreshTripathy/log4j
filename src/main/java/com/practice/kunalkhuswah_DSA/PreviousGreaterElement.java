package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class PreviousGreaterElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		
		for(int i = 0; i < n; i++) arr[i] = sc.nextLong();
		sc.close();
		
		arr = prevGreater(arr, n);
		
		System.out.println(Arrays.toString(arr));
	}

	private static long[] prevGreater(long[] arr, int n) {
		
		long[] result = new  long[n];
		Arrays.fill(result, -1);
		
		Stack<Long> st = new Stack<Long>();
		st.push(arr[0]);
		
		for(int i = 0; i < n; i++) {
			if(st.peek() > arr[i])
				result[i] = st.peek();
			if(result[i] == -1) {
				while(!st.isEmpty()) {
					if(st.peek() > arr[i]) {
						result[i] = st.peek();
						break;
					}
					st.pop();
				}
			}
			st.push(arr[i]);
		}
		
		return result;
	}
}
