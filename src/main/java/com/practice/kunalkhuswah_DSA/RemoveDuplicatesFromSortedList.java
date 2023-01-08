package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class RemoveDuplicatesFromSortedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		LinkedLists l1 = new LinkedLists();

		for (int i = 0; i < n; i++)
			l1.addNode(sc.nextInt());

		sc.close();
		l1.print();
		
		Node nd = solve(l1.head);

		while (nd != null) {
			System.out.print(nd.data + " ");
			nd = nd.next;
		}
	}

	private static Node solve(Node head) {
		Node x = null;
		Node ans = x;
		
		while(head != null) {
			if(x == null) {
				x = new Node(head.data);
				ans = x;
			}else if(x.data != head.data) {
				x.next = new Node(head.data);
				x = x.next;
			}
			head = head.next;
		}
		return ans;
	}
}
