package com.practice.kunalkhuswah_DSA;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class MissingNumber {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr = new int[sc.nextInt()];
		for(int i = 0; i< arr.length; i++)
			arr[i] = sc.nextInt();
		
		System.out.println(missingNumber(arr));
	}
	
	public static int missingNumber(int[] nums) {
		
		int n = nums.length;
        int sum = n*(n+1)/2;
        for(int i = 0; i<n;i++)
             sum -= nums[i];        
        return sum;
    }
}
