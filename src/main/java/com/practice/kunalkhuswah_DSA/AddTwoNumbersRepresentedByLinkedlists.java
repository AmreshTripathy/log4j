package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class AddTwoNumbersRepresentedByLinkedlists {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		LinkedLists l1 = new LinkedLists();
		LinkedLists l2 = new LinkedLists();

		for (int i = 0; i < n; i++)
			l1.addNode(sc.nextInt());

		for (int i = 0; i < m; i++)
			l2.addNode(sc.nextInt());

		sc.close();
		l1.print();
		l2.print();

		Node nd = addTwoLinkedLists(l1.head, l2.head);

		while (nd != null) {
			System.out.print(nd.data + " ");
			nd = nd.next;
		}
	}

	public static Node addTwoLinkedLists(Node head1, Node head2) {

		if (head1 == null)
			return head2;
		if (head2 == null)
			return head1;

		Node temp = new Node(0);
		Node ans = temp;

		Node rev_head1 = reverse(head1);
		Node rev_head2 = reverse(head2);
		
		int carry = 0;
		
		while(rev_head1 != null || rev_head2 != null) {
			int sum = 0;
			if(rev_head1 != null) {
				sum += rev_head1.data;
				rev_head1 = rev_head1.next;
			}
			if(rev_head2 != null) {
				sum += rev_head2.data;
				rev_head2 = rev_head2.next;
			}
			sum += carry;
			temp.next = new Node(sum % 10);
			carry = sum / 10;
			temp = temp.next;
		}
		
		if(carry > 0) {
			temp.next = new Node(carry);
		}
		
		ans = reverse(ans.next);
		return ans;
	}

	private static Node reverse(Node head) {
		Node prev = null;
		Node cur = head;
		Node curNext = head.next;

		while (cur != null) {
			curNext = cur.next;
			cur.next = prev;
			prev = cur;
			cur = curNext;
		}

		return prev;
	}
}
