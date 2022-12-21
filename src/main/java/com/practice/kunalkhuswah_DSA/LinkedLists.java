package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

class Node {
	int data;
	Node next;
	
	Node(int data) {
		this.data = data;
	}
}

class LinkedLists {
	Node head;
	void addNode(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	void print() {
		Node temp = head;
		while(temp.next != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
}
