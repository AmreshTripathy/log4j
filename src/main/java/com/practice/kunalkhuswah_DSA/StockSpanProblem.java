package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StockSpanProblem {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		sc.close();
		
		arr = stockSpan(arr);
		
		System.out.println(Arrays.toString(arr));
	}

	private static int[] stockSpan(int[] arr) {
		
		Stack<Integer> st = new Stack<Integer>();
		st.push(0);
		
		int[] result = new int[arr.length];
		result[0] = 1;
		
		for(int i = 1; i < arr.length; i++) {
			while(!st.isEmpty() && arr[st.peek()] <= arr[i])
				st.pop();
			
			if(st.isEmpty())
				result[i] = i + 1;
			else
				result[i] = i - st.peek();
			
			st.push(i);
		}
		
		return result;
	}
}
