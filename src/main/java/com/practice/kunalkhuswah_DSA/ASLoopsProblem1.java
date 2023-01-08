package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ASLoopsProblem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<Integer> lis = new ArrayList<Integer>();
		lis.add(n);

		while (sc.hasNext()) {
			String s = sc.next().toLowerCase();
			if (s.equals("y")) {
				lis.add(sc.nextInt());
			}else {
				break;
			}
		}
		Collections.sort(lis);
		System.out.println("Largest number: " + lis.get(lis.size()-1));
		System.out.println("Smallest number: " + lis.get(0));
		sc.close();
	}
}
