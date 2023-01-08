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
		for (int i = 0; i < n; i++)
			nums[i] = sc.nextInt();

		nums = moveZeroes(nums, n);

		for (int i = 0; i < n; i++)
			System.out.print(nums[i] + " ");
	}

	public static int[] moveZeroes(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                arr[count] = nums[i];
                count++;
            }
        }
        
        return arr;
        
//        System.out.println(Arrays.toString(nums).replace(" ", ""));
	}
}
