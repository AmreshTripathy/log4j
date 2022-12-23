package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class SubtrractLinkedList {
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

		Node nd = subtract(l1.head, l2.head);

		while (nd != null) {
			System.out.print(nd.data + " ");
			nd = nd.next;
		}
	}

	private static Node subtract(Node head1, Node head2) {
		if (head1 == null || head2 == null)
			return (head1 == null) ? head2 : head1;

		Node temp1 = head1;
		Node temp2 = head2;

		temp1 = checkZero(temp1);
		temp2 = checkZero(temp2);

		Node rev_head1 = temp1;
		Node rev_head2 = temp2;

		if (temp1 == null || temp2 == null)
			return (temp1 == null) ? temp2 : temp1;
		if (temp1 == null && temp2 == null)
			return new Node(0);

		int size1 = sizeOfNode(temp1);
		int size2 = sizeOfNode(temp2);

		Node minus = new Node(-1);
		Node ans = minus;

		minus = checkSize(minus, size1, size2, rev_head1, rev_head2);

		ans = reverse(ans.next);
		while (ans.data == 0) {
			ans = ans.next;
		}
		return ans;
	}

	private static Node checkSize(Node minus, int size1, int size2, Node rev_head1, Node rev_head2) {
		if (size1 == size2) {
			Node same_size1 = rev_head1;
			Node same_size2 = rev_head2;
			while (same_size1 != null && same_size1.data == same_size2.data) {
				same_size1 = same_size1.next;
				same_size2 = same_size2.next;
			}
			if (same_size1 == null && same_size2 == null) {
				return new Node(0);
			} else if (same_size1.data > same_size2.data) {
				rev_head1 = reverse(rev_head1);
				rev_head2 = reverse(rev_head2);
				minusSmallFromLarge(rev_head1, rev_head2, minus);
			} else {
				rev_head1 = reverse(rev_head1);
				rev_head2 = reverse(rev_head2);
				minusSmallFromLarge(rev_head2, rev_head1, minus);
			}
		} else if (size1 > size2) {
			rev_head1 = reverse(rev_head1);
			rev_head2 = reverse(rev_head2);
			minusSmallFromLarge(rev_head1, rev_head2, minus);
		} else {
			rev_head1 = reverse(rev_head1);
			rev_head2 = reverse(rev_head2);
			minusSmallFromLarge(rev_head2, rev_head1, minus);
		}
		return minus;
	}

	private static int sizeOfNode(Node temp) {
		int size = 0;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		return size;
	}

	private static Node checkZero(Node temp) {
		while (temp != null) {
			if (temp.data == 0)
				temp = temp.next;
			else
				break;
		}
		return temp;
	}

	private static void minusSmallFromLarge(Node large, Node small, Node temp) {

		while (large != null || small != null) {
			int x = large.data;
			int y = 0;
			if (small != null) {
				y = small.data;
				small = small.next;
			}

			if (x < y) {
				x = (10 + x);
				large.next.data = large.next.data - 1;
			}
			x -= y;
			temp.next = new Node(x);

			large = large.next;

			temp = temp.next;
		}
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
