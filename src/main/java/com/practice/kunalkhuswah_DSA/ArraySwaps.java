package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ArraySwaps {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int x = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
 
        System.out.println(arraySwaps(arr,n,x));
		sc.close();
	}

	private static String arraySwaps(int[] arr, int n, int x) {
		
//		int count_swap = 0;
		
		for(int i = 0; i < n; i++) {
			
		}
		
		return "YES";
	}
}
