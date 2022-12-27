package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class InsertionInCircularLinkedList {
	static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	static class LinkedList {
		Node head;
		
		void addNode(int data) {
			Node node = new Node(data);
			
			if(head == null) {
				head = node;
				node.next = head;
			}
			
			Node curr = head;
			
			while(curr.next != head) {
				curr = curr.next;
			}
			
			curr.next = node;
			node.next = head;
		}
		
		void print() {
			Node curr = head;
			
			while(curr.next != head) {
				System.out.print(curr.data + " ");
				curr = curr.next;
			}
			
			System.out.println(curr.data);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		LinkedList l = new LinkedList();
		for(int i = 0; i < n; i++)
			l.addNode(sc.nextInt());
		
		int k = sc.nextInt();
		sc.close();
		
		l.print();
		addNodeAtLast(l, k);
		l.print();
	}

	private static void addNodeAtLast(LinkedList l, int k) {
		Node temp = l.head;
		
		while(temp.next != l.head) {
			temp = temp.next;
		}
		
		Node node = new Node(k);
		temp.next = node;
		node.next = l.head;
	}
}
