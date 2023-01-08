package com.practice.kunalkhuswah_DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class SecondMostRepeatedWords {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		String[] arr = new String[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = sc.next();
		
		System.out.println(secondMostWord(arr, n));
	}
	
	private static String secondMostWord(String[] arr, int n) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i < n; i++) {
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i])+1);
			else
				map.put(arr[i], 1);
		}
		
		int max = 0;
		for(Object i : map.values().toArray()) {
			if(max < (int) i)
				max = (int) i;
		}
		max -= 1;
		String element = "";
		for(int i = 0; i < n; i++) {
			if(map.get(arr[i]) == max) {
				element = arr[i];
				break;
			}
		}
		
		return element;
	}
}
