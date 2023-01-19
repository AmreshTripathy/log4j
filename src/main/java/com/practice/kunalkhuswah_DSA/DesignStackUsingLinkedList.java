package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=42e0af38-ed64-456b-b7a5-43b885320ff
 */

import java.util.Scanner;

public class DesignStackUsingLinkedList {
    static class Node {

        int data;
        Node link;

        Node(int data) {
            this.data = data;
            link = null;
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedlist obj = new StackUsingLinkedlist();
        Scanner sc = new Scanner(System.in);
        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            int x;
            x = sc.nextInt();
            if (x == 1) {
                int y;
                y = sc.nextInt();
                obj.push(y);
            }
            if (x == 2) {
                System.out.println(obj.peek());
            }
            if (x == 3) {
                obj.pop();
            }
            if (x == 4) {
                Node temp = obj.display();
                while (temp != null) {

                    System.out.print(temp.data + " ");

                    temp = temp.link;
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

class StackUsingLinkedlist extends DesignStackUsingLinkedList{

	Node top;
	StackUsingLinkedlist() { this.top = null; }

	public void push(int x)
	{
		Node newNode = new Node(x);
        newNode.link = top;
        top = newNode;
	}

	public int peek()
	{
		return (top == null) ? -1 : top.data;
	}

	public void pop()
	{
        if(top == null || top.link == null) {
            top = null;
            return;
        }
		top.data = top.link.data;
        top.link = top.link.link;
	}

	public Node display()
	{
		return top;
	}
}