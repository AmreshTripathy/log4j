package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class RemoveElementsFromAnArray {
	protected static Scanner sc = new Scanner(System.in);
	
	public static int removeElement(int[] nums, int val) {
		int k = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != val)
            {
               nums[k++] = nums[i];
            }
        }
        return k;
	}
	
	public static void main(String[] args) {
		
		int value = sc.nextInt();
		int[] arr = new int[5];
		
		for(int i =0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(removeElement(arr, value));
	}
}
