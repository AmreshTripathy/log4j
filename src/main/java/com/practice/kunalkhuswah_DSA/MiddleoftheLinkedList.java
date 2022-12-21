package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class MiddleoftheLinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedLists l = new LinkedLists();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++)
			l.addNode(sc.nextInt());
		sc.close();
		l.print();
		Node l1 = middleNode(l.head);
		while (l1 != null) {
            System.out.print(l1.data + " ");
            l1 = l1.next;
        }
	}
	
	public static Node middleNode(Node head) {
        if(head == null)
			return null;
        Node slow = head;
        Node fast = head;

		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
    }
}
