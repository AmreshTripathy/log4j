package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ReverseStringWithIntactSpacing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(reverseWithIntactSpacing(sc.nextLine()));
		sc.close();
	}

	private static String reverseWithIntactSpacing(String S) {
		
		StringBuilder sb = new StringBuilder();
		List<Integer> lis = new ArrayList<Integer>();
		for(int i = S.length()-1; i >= 0; i--) {
			if(S.charAt(i) == ' ') {
				lis.add(i);
			}else {
				sb.append(S.charAt(i));
			}
		}
		Collections.sort(lis);
		
		for(int spaceIndex : lis) {
			sb.insert(spaceIndex, ' ');
		}
		
		return sb.toString();
	}
}
