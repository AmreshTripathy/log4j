package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class AmazingSubstring {
	protected static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print(countTheSubStringsStartsFromVowel(sc.next()));
	}

	private static int countTheSubStringsStartsFromVowel(String str) {
		int count = 0;
		char[] arr = str.toCharArray();
		int n = arr.length;
//		List<Character> lis = new ArrayList<Character>();
//		Collections.addAll(lis, 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
//		
//		for(char ch : arr) {
//			if(lis.contains(ch)) {
//				if(str.indexOf(ch) >= 0)
//					count += (n -str.indexOf(ch));
//			}
//		}

		for (int i = 0; i < n; i++) {
			if (arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U' || arr[i] == 'a' || arr[i] == 'e'
					|| arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {
				count += (n - i);
			}
		}

		return count % 10003;
	}
}
