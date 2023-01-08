package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

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
       
       int n = nums.length;
       for(int i = 0; i < n-1; i++) {
//    	   if(nums[i-1] < nums[i] && nums[i] > nums[i+1]) {
//    		   return true;
//    	   }
    	   for(int j = i+1; j < n; j++) {
    		   for(int k = j+1; k < n; k++) {
    			   if(nums[i] < nums[k] && nums[k] < nums[j])
    				   return true;
    		   }
    	   }
       }
       
       return false;
    }
}
