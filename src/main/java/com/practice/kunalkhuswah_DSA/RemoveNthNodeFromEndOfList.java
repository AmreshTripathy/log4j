package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class RemoveNthNodeFromEndOfList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedLists l = new LinkedLists();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
			l.addNode(sc.nextInt());
		int pos = sc.nextInt();
		sc.close();
		l.print();
		Node l1 = removeFromLast(l, l.head, pos);
		while (l1 != null) {
            System.out.print(l1.data + " ");
            l1 = l1.next;
        }
	}

	private static Node removeFromLast(LinkedLists l, Node head, int pos) {
		if (head.next == null) {
			return null;
		}

		int size = 0;
		Node temp = head;
		while (temp != null) {
			temp = temp.next;
			size++;
		}

		Node temp_1 = head;
		int diff = size - pos;
		for (int index = 1; index < diff; index++) {
			temp_1 = temp_1.next;
		}
		if (diff != 0) {
			temp_1.next = temp_1.next.next;
		}
		return  diff == 0 ? head.next : head;
	}
}
