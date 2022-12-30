package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class SwapPairWiseNodeInLinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedLists l = new LinkedLists();

		for (int i = 0; i < n; i++)
			l.addNode(sc.nextInt());

		l.print();
		sc.close();
		pairWiseSwap(l.head);
		l.print();
	}

	private static void pairWiseSwap(Node head) {
		if (head != null && head.next != null) {

			int temp = head.data;
			head.data = head.next.data;
			head.next.data = temp;

			pairWiseSwap(head.next.next);
		}
	}
}
