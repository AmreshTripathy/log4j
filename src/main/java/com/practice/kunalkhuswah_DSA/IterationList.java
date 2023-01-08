package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class IterationList {
	protected static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		List<Integer> lis = new ArrayList<Integer>();
		
		Collections.addAll(lis, 1, 2, 3, 4, 5);
		
		for(int i : lis) {
			lis.add(i);
			lis.remove(i);
		}
		System.out.print(lis);
	}
}
