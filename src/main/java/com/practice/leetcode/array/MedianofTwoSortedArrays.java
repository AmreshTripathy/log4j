package com.practice.leetcode.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 */

public class MedianofTwoSortedArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums1 = new int[n];
		for(int i = 0; i < n; i++) nums1[i] = sc.nextInt();
		
		int m = sc.nextInt();
		int[] nums2 = new int[m];
		for(int i = 0; i < m; i++) nums2[i] = sc.nextInt();
		
		sc.close();
		System.out.printf("%.5f", findMedianSortedArrays(nums1, nums2));
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] result = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, result, 0, nums1.length);
        System.arraycopy(nums2, 0, result, nums1.length, nums2.length);
        Arrays.sort(result);
        double d = 0;
        int n = result.length;
        if(n % 2 == 0) {
        	d = (Double.valueOf(result[n/2-1]) + Double.valueOf(result[n/2])) / 2;
        }else {
        	d = Double.valueOf(result[n/2]);
        }
        
        return d;
    }
}
