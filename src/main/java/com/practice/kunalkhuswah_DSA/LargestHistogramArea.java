package com.practice.kunalkhuswah_DSA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

/*
 * @Amresh Tripathy
 */

public class LargestHistogramArea {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        long[] arr = new long[(int)n];
        for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
        br.close();
        System.out.println(maximumArea(arr, n));
	}

	private static long maximumArea(long[] arr, long n) {
		
		long area = 1;
		
		for(int i = 0; i < n; i++) {
			
			long leftLength = leftIndexOf(arr, i, (int) n);
			long rightLength = rightIndexOf(arr, i, (int) n);
			
			area = Long.max(area, (arr[i] * (leftLength + rightLength + 1)));
			
		}
		
		return area;
	}

	private static long rightIndexOf(long[] arr, int index, int n) {
		
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i = n - 1; i > index; i--) {
			st.push(i);
		}
		
		int count = 0;
		while(!st.isEmpty() && arr[index] <= arr[st.peek()]) {
			count++;
			st.pop();
		}
		
		return count;
	}

	private static long leftIndexOf(long[] arr, int index, int n) {
		Stack<Integer> st = new Stack<Integer>();
		
		for(int i = 0; i < index; i++) {
			st.push(i);
		}
		
		int count = 0;
		while(!st.isEmpty() && arr[st.peek()] >= arr[index]) {
			count++;
			st.pop();
		}
		
		return count;
	}
}
