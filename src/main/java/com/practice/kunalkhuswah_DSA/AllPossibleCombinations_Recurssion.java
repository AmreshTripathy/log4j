package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class AllPossibleCombinations_Recurssion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ArrayList<String> A = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			A.add(sc.next());
		}
		sc.close();
		ArrayList<String> ans = new ArrayList<String>();
		ans = specialStrings(A, 0, "", new ArrayList<String>());
		Collections.sort(ans);
		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}

	}

	public static ArrayList<String> specialStrings(ArrayList<String> A, int index, String ans, ArrayList<String> lis) {
		if (index == A.size()) {
			lis.add(ans);
			return lis;
		}

		for (int i = 0; i < A.get(index).length(); i++) {
			lis = specialStrings(A, index + 1, ans + A.get(index).charAt(i), lis);
		}

		return lis;
	}
}
