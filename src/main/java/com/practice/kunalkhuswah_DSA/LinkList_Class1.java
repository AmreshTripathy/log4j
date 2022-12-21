package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

public class LinkList_Class1 {
	public static void main(String[] args) { 
        LinkedLists ll = new LinkedLists();
        ll.addNode(5);
        ll.addNode(7);
        ll.addNode(100);
        ll.addNode(2340);
        ll.printList();
    }
}

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
	
	void printList() {
		Node temp = head;
		while(temp != null){
            System.out.println(temp+" "+temp.data+" "+temp.next);
            temp = temp.next;
        }
	}
}
