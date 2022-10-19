package com.practice.kunalkhuswah_DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class MaxSequence {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(sequence(arr,n));
	}
	
	public static int sequence(int[] arr, int n) {
		
		int count = 1;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Arrays.sort(arr);
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			}
			count = 1;
		}
		
		int max = 0;
		int number = 0;
		
		for(int i = 0; i < n; i++) {
			if(map.get(arr[i]) > max) {
				max = map.get(arr[i]);
				number = arr[i];
			}
		}
		
		return number;
	}
}
