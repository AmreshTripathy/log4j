package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MaximumProductSubArray {
	protected static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
        String[] inputLine = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputLine[i]);
        }
        
        System.out.println(maxProduct(arr, n));
	}
	
	private static long maxProduct(int[] arr, int n) {
		
		long max = 0;
		
		for(int i = 0; i < n; i++) {
			long product = arr[i];
			if(max < product) {
				max = product;
			}
			for(int j = i+1; j < n; j++) {
				product *= arr[j];
				if(max < product) {
					max = product;
				}
			}
		}
		
        return max;
    }
}
