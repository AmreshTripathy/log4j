package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class RearrangeEvenOddNodes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		LinkedLists l1 = new LinkedLists();

		for (int i = 0; i < n; i++)
			l1.addNode(sc.nextInt());

		sc.close();
		l1.print();
		
		Node nd = rearrangeList(l1.head);

		while (nd != null) {
			System.out.print(nd.data + " ");
			nd = nd.next;
		}
	}

	private static Node rearrangeList(Node head) {
		Node x = head;
		Node y = x;
		Node ans = new Node(-1);
		Node ans1 = ans;
		Node ans2 = ans1;
		
		while(x != null) {
			if(x.next != null && x.next.data % 2 == 0) {
				ans.next = new Node(x.next.data);
				x.next = x.next.next;
				ans = ans.next;
			}
			x = x.next;
		}
		
		while(ans1.next != null)
			ans1 = ans1.next;
		
		ans1.next = y;
		return ans2.next;
	}
}
