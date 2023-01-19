package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=b3346122-ef12-4cc2-b8aa-4b1d9fdda3ba
 */

import java.util.Scanner;

public class QueueUsingLinkedList {
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue1 q = new Queue1();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int op = sc.nextInt();
            if(op == 1) {
                int x = sc.nextInt();
                q.push(x);
            }
            else if(op == 2) {
                System.out.println(q.pop());
            }
            else if(op == 3)
                System.out.println(q.front());
            else if(op == 4)
                System.out.println(q.getSize());
        }
        sc.close();
    }
}

class Queue1 extends QueueUsingLinkedList{
    Node top;
	Queue1() { this.top = null; }
    public void push(int value) {
        Node newNode = new Node(value);
		if(top == null) {
			top = newNode;
			return;
		}
		Node temp = top;
		while(temp.next != null)
			temp = temp.next;
		temp.next = newNode;
    }
    public int pop() {
        // if(top == null || top.link == null) {
        //     top = null;
        //     return;
        // }
		int ele = top.data;
		top.data = top.next.data;
        top.next = top.next.next;
		
		return ele;
    }
    public int front() {
        return top.data;
    }
    public int getSize() {
		int size = 0;
        Node temp = top;
		while(temp != null) {
			temp = temp.next;
			size++;
		}
		return size;
    }
}