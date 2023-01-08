package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class LargestHistogramArea_Optimized {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine().trim());
		String inputLine[] = br.readLine().trim().split(" ");
		long[] arr = new long[(int) n];
		for (int i = 0; i < n; i++)
			arr[i] = Long.parseLong(inputLine[i]);
		br.close();
		System.out.println(maximumArea(arr, n));
	}

	private static long maximumArea(long[] arr, long n) {

		long area = 0;

		long[] leftLength = leftIndexOf(arr, (int) n); // finding left side index upto which element is great or equal
		long[] rightLength = rightIndexOf(arr, (int) n); // // finding right side index upto which element is great or equal

		for (int i = 0; i < n; i++) {
			area = Long.max(area, (arr[i] * (rightLength[i] - leftLength[i] - 1)));
		}

		return area;
	}

	private static long[] rightIndexOf(long[] arr, int n) {
		long[] right = new long[n];
		
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i = n - 1; i >= 0; i--) {
			while(!st.isEmpty() && arr[i] <= arr[st.peek()])
				st.pop();
			if(st.isEmpty())
				right[i] = n;
			else
				right[i] = st.peek();
			
			st.push(i);
		}
		
		return right;
	}

	private static long[] leftIndexOf(long[] arr, int n) {
		long[] left = new long[n];
		
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i = 0; i < n; i++) {
			while(!st.isEmpty() && arr[st.peek()] >= arr[i])
				st.pop();
			if(st.isEmpty())
				left[i] = -1;
			else
				left[i] = st.peek();
			
			st.push(i);
		}
		
		return left;
	}
}
