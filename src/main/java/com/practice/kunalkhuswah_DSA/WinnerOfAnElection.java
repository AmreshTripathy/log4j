package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WinnerOfAnElection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String arr[] = new String[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.next();

		sc.close();
		String ans = winner(arr, n);

		System.out.println(ans);
	}

	private static String winner(String[] arr, int n) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < n; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		
		String name = "";
		int max = 0;
		
		List<String> lis = new ArrayList<String>(map.keySet());
//		lis.sort(null);
		Collections.sort(lis);
		for(String s: lis) {
			if(max < map.get(s)) {
				max = map.get(s);
				name = s;
			}
		}
		return name;
	}
}
