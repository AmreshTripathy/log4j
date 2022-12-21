package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class DeleteNode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedLists1 ll = new LinkedLists1();
		for(int i = 0; i < n; i++) {
			ll.addNode(sc.nextInt());
		}
		ll.print();
		int toRemove = sc.nextInt();
		sc.close();
		
		remove(ll, toRemove);
			
	}
	
	public static void remove(LinkedLists1 ll, int toRemove){
        
		if(toRemove == 0) {
			ll.head = ll.head.next;
			ll.print();
			return;
		}
		
		int index = 0;
		Node1 temp = ll.head;
		
		while(index + 1 != toRemove) {
			temp = temp.next;
			index += 1;
		}
		
		temp.next = temp.next.next;
		ll.print();
    }
}

class Node1 {
	int data;
	Node1 next;
	
	Node1(int data) {
		this.data = data;
	}
}

class LinkedLists1 {
	Node1 head;
	
	void addNode(int data) {
		Node1 newNode = new Node1(data);
		if(head == null) {
			head = newNode;
			return;
		}else {
			Node1 temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	void print() {
		Node1 temp = head;
		while(temp.next != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
}
