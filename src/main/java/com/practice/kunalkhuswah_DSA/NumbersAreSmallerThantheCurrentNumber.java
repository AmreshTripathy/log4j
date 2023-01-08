package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class NumbersAreSmallerThantheCurrentNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        int[] nums = new int[n];  
        for(int i=0; i<n; i++)  
        {  
            nums[i]=sc.nextInt();  
        }
        sc.close();
        int[] ans = smallerNumbersThanCurrent(nums);
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
	}

	private static int[] smallerNumbersThanCurrent(int[] nums) {
		int n = nums.length;
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			int count = 0;
			for(int j = 0; j < n; j++) {
				if(nums[j] < nums[i])
					count++;
			}
			arr[i] = count;
		}
		
		return arr;
	}
}
