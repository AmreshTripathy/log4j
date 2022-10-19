package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class RemoveDuplicatedFromShortedArray {
	
	protected static Scanner sc = new Scanner(System.in);
	
	public static int removeDuplicates(int[] nums) {
		
		int[] temp = new int[nums.length];
		int j = 0;
		
		for(int i =0; i < nums.length - 1; i++) {
			if(nums[i] != nums[i+1]) {
				temp[j++] = nums[i];
			}
		}
		
		temp[j++] = nums[nums.length - 1];
		 
        // Modify original array
        for (int i = 0; i < j; i++)
            nums[i] = temp[i];
 
        return j;
    }
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for(int i =0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(removeDuplicates(arr));
	}
}
