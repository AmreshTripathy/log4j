package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class RotateTheLinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedLists l = new LinkedLists();
		
		for(int i = 0; i < n; i++)
			l.addNode(sc.nextInt());
		
		int k = sc.nextInt();
		sc.close();
		
		l.print();
		
		rotateRight(l.head, k);
	}

	private static void rotateRight(Node head, int n) {
		if(n == 0) {
			while(head != null) {
				System.out.print(head.data + " ");
				head = head.next;
			}
			return;
		}
		
		int size = 0;
		
		Node temp = head;
		Node temp1 = head;
		Node temp2 = temp1;
		
		while(temp != null) {
			size++;
			temp = temp.next;
		}
		
		if(n % size == 0){
			while(head != null) {
				System.out.print(head.data + " ");
				head = head.next;
			}
			return;
		}

		n = (n % size);
		
		int end = size - n;
		int size1 = 0;
		
		while(size1 < end - 1) {
			temp1 = temp1.next;
			size1++;
		}
		
		Node leftNode = temp1.next;
		Node leftNode1 = leftNode;
		temp1.next = null;
		
		while(leftNode1.next != null) {
			leftNode1 = leftNode1.next;
		}
		
		leftNode1.next = temp2;
		
		while(leftNode != null) {
			System.out.print(leftNode.data + " ");
			leftNode = leftNode.next;
		}
		
	}
}
