package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class InsertNodeAtDoublyLinkedList {
	static class Node{
	    int data;
	    Node next;
	    Node prev;
	    Node(int data){
	        this.data = data;
	        next = null;
	        prev = null;
	    }
	}
	static class LinkedList{
	    Node head;
	    void add(int data ){
	        Node new_node = new Node(data);
	        if(head == null){
	            head = new_node;
	            return;
	        }
	        Node current = head;
	        while(current.next !=null){
	            current = current.next;
	        }
	        current.next = new_node;
	    }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        LinkedList list = new LinkedList();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        sc.close();
        Node head = insertAtHead(list.head,K);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
	}

	private static Node insertAtHead(Node head, int k) {
		Node newNode = new Node(k);
		
		newNode.next = head;
		head.prev = newNode;
		
		return newNode;
	}
}
