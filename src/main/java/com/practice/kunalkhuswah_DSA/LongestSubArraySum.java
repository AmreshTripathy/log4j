package com.practice.kunalkhuswah_DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class LongestSubArraySum {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int loop_no = sc.nextInt();
		
//		List<Integer> lis = new ArrayList<Integer>();
		
		for(int i  =  0; i < loop_no; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			int[] arr = new int[n];
			
			for(int j =0; j < n; j++)
				arr[j] = sc.nextInt();
			
			System.out.println(lengthCount(arr, n, k));
		}
		
//		for(int i  =  0; i < loop_no; i++)
//			System.out.println(lis.get(i));
	}
	
//	private static void performSubArraySum(List<Integer> lis) {
//		int n = sc.nextInt();
//		int k = sc.nextInt();
//		
//		int[] arr = new int[n];
//		
//		for(int i =0; i < n; i++)
//			arr[i] = sc.nextInt();
//		
//		System.out.println(lengthCount(arr, n, k));
//		
////		lis.add(maxLenght);
//		
//	}

	private static int lengthCount(int[] arr, int n, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int length = 0;
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += arr[i];
			if(sum == k) {
				length = i + 1;
			}else if(map.containsKey(sum - k)) {
				length = Math.max(length, i - map.get(sum - k));
			}
			
			if(!map.containsKey(sum)) {
				map.put(sum, i);
			}
		}
		
		
//		 int length = 0;
//			
//			for(int i =0; i < n; i++) {
//				int sum = 0;
//				for(int j = i; j < n; j++) {
//					sum += arr[j];
//					if(sum == k && length < (j - i + 1)) {
//						length = j - i + 1;
//					}
//				}
//			}
		
		return length;
	}
}
