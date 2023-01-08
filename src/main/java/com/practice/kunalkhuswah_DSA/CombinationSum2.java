package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CombinationSum2 {
	public static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int sum) {

		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();

		Collections.sort(a);
		solve(al, a, new ArrayList<Integer>(), 0, sum);
		return al;
	}

	public static void solve(ArrayList<ArrayList<Integer>> al, ArrayList<Integer> in, ArrayList<Integer> op, int i,
			int sum) {

		if (sum < 0)
			return;

		if (i == in.size()) {

			if (sum == 0)
				al.add(op);
			return;
		}

		ArrayList<Integer> op1 = new ArrayList<Integer>(op);
		op1.add(in.get(i));
		solve(al, in, op1, i + 1, sum - in.get(i));

		if (!(op.size() != 0 && in.get(i) == op.get(op.size() - 1))) {

			ArrayList<Integer> op2 = new ArrayList<Integer>(op);
			solve(al, in, op2, i + 1, sum);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		int sum = sc.nextInt();
		sc.close();
		ArrayList<ArrayList<Integer>> ans = combinationSum(a, sum);
		Collections.sort(ans, new Comparator<ArrayList<Integer>>() {
			public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
				for (int i = 0; i < Math.min(o1.size(), o2.size()); i++)
					if (o1.get(i) != o2.get(i))
						return o1.get(i).compareTo(o2.get(i));

				return o1.size() > o2.size() ? 1 : 0;
			}

		});
		for (ArrayList<Integer> A : ans) {
			for (Integer B : A) {
				System.out.print(B + " ");
			}
			System.out.println();
		}

	}
}
