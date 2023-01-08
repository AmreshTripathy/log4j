package com.practice.kunalkhuswah_DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class MostFrequentWordInArray {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int n = sc.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = sc.next();
		}
		mostFrequent(arr, n);
	}

	public static void mostFrequent(String []arr, int n) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++) {
        	if(map.containsKey(arr[i])) {
        		map.put(arr[i], map.get(arr[i])+1);
        	}else {
        		map.put(arr[i], 1);
        	}
        }
        
        String wd = "";
        int max = 0;
        
//        for(Entry<String, Integer> entry : map.entrySet()) {
//        	if(max < entry.getValue()) {
//        		max = entry.getValue();
//        		wd = entry.getKey();
//        	}
//        }
        for(int i = 0; i < n; i++) {
        	if(max <= map.get(arr[i])) {
        		max = map.get(arr[i]);
        		wd = arr[i];
        	}
        }
        
        System.out.print(wd);
    }
}
