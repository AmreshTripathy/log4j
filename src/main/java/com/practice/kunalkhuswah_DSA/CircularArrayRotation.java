package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class CircularArrayRotation {
	
	protected static Scanner sc = new Scanner(System.in);
	
	public static int[] mod_arr(int[] arr, int n, int d) {
		if(arr.length == d) {
			return arr;
		}
		for(int i = 0; i < d; i++){
			int j, last;
	        last = arr[arr.length-1];    
	            
	        for(j = arr.length-1; j > 0; j--){
	        	arr[j] = arr[j-1];    
	        }    
	        arr[0] = last; 
	    }    
		
		return arr;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		int n = sc.nextInt();
		int k = sc.nextInt();
//		int q = sc.nextInt();
		
		int[] arr = new int[n];
//		int[] queries = new int[q];
		
		for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
		
//		for(int i=0;i<q;i++){
//			queries[i]=sc.nextInt();
//        }
		arr = mod_arr(arr, n, k);
		
		for(int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
//		for(int i = 0; i < q; i++) {
//			System.out.println(arr[queries[i]]);
//		}
	}
}
