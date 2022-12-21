package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class InsertNodeAtASpecificPositionInAlinked_list {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedLists ll = new LinkedLists();
		for(int i = 0; i < n; i++) {
			ll.addNode(sc.nextInt());
		}
		ll.print();
		int val = sc.nextInt();
        int pos = sc.nextInt();
		sc.close();
		
		Node head = insert(ll.head, n, pos, val);
		while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
	}

	private static Node insert(Node head, int n, int pos, int val) {
		Node newNode = new Node(val);
		if(pos == 0) {
			newNode.next = head;
			return newNode;
		}

		int index = 0;
		Node temp = head;

		while(index + 1 != pos) {
			temp = temp.next;
			index++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		
		
		return head;
    }
}
