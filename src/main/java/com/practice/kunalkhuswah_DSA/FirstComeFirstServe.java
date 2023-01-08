package com.practice.kunalkhuswah_DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class FirstComeFirstServe {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
        int n = sc.nextInt(), k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        System.out.println(firstElement(arr, n, k));
	}
	
	public static int firstElement(int arr[], int n, int k) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < n; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(map.get(arr[i]) == k) {
				return arr[i];
			}
		}
		
		return -1;
    }
}
