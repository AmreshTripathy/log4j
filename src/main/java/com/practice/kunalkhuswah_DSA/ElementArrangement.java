package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ElementArrangement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++)
			arr[i] = sc.nextInt();

		sc.close();
		ArrayList<Integer> ans = arrange(arr, N);
		for (int x : ans)
			System.out.print(x + " ");

		System.out.println();
	}

	private static ArrayList<Integer> arrange(int arr[], int n) {
		ArrayList<Integer> lis = new ArrayList<Integer>();
		ArrayList<Integer> rev_lis = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			if(i % 2 == 0)
				lis.add(arr[i]);
			else
				rev_lis.add(arr[i]);
		}
		
		Collections.reverse(rev_lis);
		
		lis.addAll(rev_lis);
		
		return lis;
	}
}
