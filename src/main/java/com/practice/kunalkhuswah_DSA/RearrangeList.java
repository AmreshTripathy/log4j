package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class RearrangeList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		LinkedLists l1 = new LinkedLists();

		for (int i = 0; i < n; i++)
			l1.addNode(sc.nextInt());

		sc.close();
		l1.print();
		
		Node nd = rearrange(l1.head);

		while (nd != null) {
			System.out.print(nd.data + " ");
			nd = nd.next;
		}
	}

	private static Node rearrange(Node head) {
		Node temp = head;
		Node ans = temp;
		
		while(temp != null) {
			temp.next = reverse(temp.next); // reversing the next node and assigning it again
			temp = temp.next;
		}
		
		return ans;
	}

	private static Node reverse(Node head) {
		if(head == null) return head;
		Node prev = null; Node cur = head; Node curNext = head.next;
		
		while(cur != null) {
			curNext = cur.next;
			cur.next = prev;
			prev = cur;
			cur = curNext;
		}
		
		return prev;
	}
}
