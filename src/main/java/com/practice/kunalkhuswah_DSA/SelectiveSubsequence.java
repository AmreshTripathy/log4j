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

public class SelectiveSubsequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();

		ArrayList<String> lis = printSubSequence(str, "", str.length() - 1, new ArrayList<String>());

		for (String s : lis)
			System.out.println(s);
	}

	private static ArrayList<String> printSubSequence(String str, String ans, int i, ArrayList<String> lis) {
		if (i == -1) {
			if ((ans.length() % 2 == 0 || ans.length() % 7 == 0) && !ans.isEmpty()) {
				lis.add(ans);
			}
			return lis;
		}

		if (i < -1)
			return lis;

		lis = printSubSequence(str, ans, i - 1, lis);
		lis = printSubSequence(str, str.charAt(i) + ans, i - 1, lis);

		return lis;
	}
}
