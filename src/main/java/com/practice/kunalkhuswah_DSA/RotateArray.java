package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class RotateArray {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
		int k = sc.nextInt();
		
		arr = rotate(arr, k);
		
		for(int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
	
	private static int[] rotate(int[] arr, int k) {
		if(arr.length == k) {
			return arr;
		}
		
		while(k-- > 0) {
			int j, first;
	        first = arr[0];    
	            
	        for(j = 0; j < arr.length-1; j++){
	        	arr[j] = arr[j+1];    
	        }    
	        arr[arr.length-1] = first;
		}
		
		return arr;
	}
}
