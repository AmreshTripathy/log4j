package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;
import java.util.Stack;

/*
 * @Amresh Tripathy
 */

public class OneThreeTwoPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		boolean result = find132pattern(arr);
		if (result)
			System.out.println("true");
		else
			System.out.println("false");
		sc.close();
	}

	private static boolean find132pattern(int[] nums) {
		
		int[] min = new int[nums.length];
		min[0] = nums[0];
		for(int i = 1; i < nums.length; i++) min[i] = Integer.min(min[i - 1], nums[i]);
		
		Stack<Integer> stk = new Stack<Integer>();
		
		for(int i = nums.length - 1; i >= 0; i--) {
			while(stk.size() > 0 && stk.peek() <= min[i])
				stk.pop();
			
			if(stk.size() > 0 && stk.peek() < nums[i])
				return true;
			stk.push(nums[i]);
		}
		
		return false;
	}
}
