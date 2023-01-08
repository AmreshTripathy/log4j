package com.practice.acciojob;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class MaximumSubArraySum {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws java.lang.Exception {
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println(maxSum(arr, n, k));
	}

	private static long maxSum(int[] arr, int n, int k) {
		int i=0,j=0;
        long maxiSum = Integer.MIN_VALUE;
        long sum=0;
        
        while(j<n){
            sum+=arr[j];
            
            if(j-i+1==k){
                maxiSum=Math.max(maxiSum,sum);
                sum-=arr[i];
                i++;
            }
            j++;
        }
        return maxiSum;
		
//		long max = Integer.MIN_VALUE;
//		long sum = 0;
//		int i = 0;int j = 0;
//		while(i<n) {
//			while(j < i+k && j < n) {
//				sum += arr[j];
//				j++;
//			}
//			if(max < sum)l {
//				max = sum;
//			}
//			sum = 0;
//			i++;
//			j = i;
//		}
//		for (int i = 0; i < n; i++) {
//			for(int j = i; j < i+k && j < n; j++) {
//				sum += arr[j];
//			}
//			if(max < sum) {
//				max = sum;
//			}
//			sum = 0;
//		}
//		return max;
	}
}
