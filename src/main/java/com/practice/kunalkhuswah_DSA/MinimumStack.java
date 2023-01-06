package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;
import java.util.Stack;

/*
 * @Amresh Tripathy
 */

public class MinimumStack {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T > 0) {
			int q = sc.nextInt();
			Solution g = new Solution();
			while (q > 0) {
				int qt = sc.nextInt();

				if (qt == 1) {
					int att = sc.nextInt();
					g.push(att);
				} else if (qt == 2) {
					System.out.print(g.pop() + " ");
				} else if (qt == 3) {
					System.out.print(g.getMin() + " ");
				}

				q--;
			}
			System.out.println();
			T--;
		}
		sc.close();

	}

	static class Solution {
		int minEle;
		Stack<Integer> s;

		Solution() {
			s = new Stack<Integer>();
		}

		void push(int x) {
			s.push(x);
		}

		int pop() {
			if (s.size() == 0)
				return -1;
			return s.pop();
		}

		int getMin() {
			if (s.size() == 0)
				return -1;

			int minVal = Integer.MAX_VALUE;
			Stack<Integer> temp = new Stack<Integer>();

			while (s.size() > 0) {
				int popEle = s.pop();
				minVal = Integer.min(minVal, popEle);
				temp.push(popEle);
			}

			while (temp.size() > 0)
				s.push(temp.pop());

			return minVal;
		}
	}
}
