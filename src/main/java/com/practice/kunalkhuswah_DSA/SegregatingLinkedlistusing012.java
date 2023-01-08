package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class SegregatingLinkedlistusing012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		LinkedLists l1 = new LinkedLists();

		for (int i = 0; i < n; i++)
			l1.addNode(sc.nextInt());

		sc.close();
		l1.print();
		
		Node nd = unfold(l1.head);

		while (nd != null) {
			System.out.print(nd.data + " ");
			nd = nd.next;
		}
	}

	private static Node unfold(Node head) {
		Node dummy0 = new Node(0);
		Node dummy1 = new Node(0);
		Node dummy2 = new Node(0);

		Node tmp0 = dummy0, tmp1 = dummy1, tmp2 = dummy2;

		Node tmp = head;

		while(tmp != null){
			if(tmp.data == 0){
				tmp0.next = tmp;
				tmp0 = tmp0.next;
			}
			else if(tmp.data == 1){
				tmp1.next = tmp;
				tmp1 = tmp1.next;
			}
			else if(tmp.data == 2){
				tmp2.next = tmp;
				tmp2 = tmp2.next;
			}
			tmp = tmp.next;
		}

		tmp2.next = null;
		tmp1.next = dummy2.next;
		tmp0.next = dummy1.next;
		head = dummy0.next;

		tmp = head;

		return tmp;
	}
}
