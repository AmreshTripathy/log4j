package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class GoodTripletsFromArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sc.close();
        System.out.println(getGoodTriplets(arr, n, a, b, c));
	}
	
	private static int getGoodTriplets(int[] arr, int n, int a, int b, int c) {
        int count = 0;
        
        for(int i = 0; i < n; i++) {
        	for(int j = i+1; j < n; j++) {
        		if(Math.abs(arr[i] - arr[j]) <= a) {
        			for(int k = j+1; k < n; k++) {
        				if(Math.abs(arr[j] - arr[k]) <= b) {
        					if(Math.abs(arr[i] - arr[k]) <= c) {
        						count++;
        					}
        				}
        			}
        		}
        	}
        }
        
        return count;
    }
}
