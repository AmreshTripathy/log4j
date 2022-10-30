package com.practice.kunalkhuswah_DSA;

import java.util.Arrays;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class MoveZeros {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		
		int[] nums = new int[n];
		for(int i = 0; i < n; i++)
			nums[i] = sc.nextInt();
		
		moveZeroes(nums);
	}
	
	public static void moveZeroes(int[] nums) {
        int[] arr = new int[nums.length];
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                arr[count] = nums[i];
                count++;
            }
        }
        
        nums = arr;
        
        System.out.println(Arrays.toString(nums).replace(" ", ""));
    }
}
