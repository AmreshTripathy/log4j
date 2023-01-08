package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

/*
 * @Amresh Tripathy
 */

public class WateringPlants {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		System.out.println(stepCount(arr, n, k));
	}
	
	private static int stepCount(int[] arr, int n, int k) {
		int container = k;
		int final_steps = 0;
		int steps = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < n; i++) {
			if(arr[i] <= container) {
				container -= arr[i];
				if(i > 0) {
//					map.put(i, (steps+i+1-map.get(i-1)));
					if(steps > 0) {
						map.put(i, (i+1));
					}else {
						map.put(i, 1);
					}
				}else {
					map.put(i, i+1);
				}
				steps = 0;
			}else {
				container = k;
				steps += i;
				final_steps += steps;
				i--;
			}
		}
		for(int i = 0; i < n; i++) {
			final_steps += map.get(i);
		}
		return final_steps;
	}
}
