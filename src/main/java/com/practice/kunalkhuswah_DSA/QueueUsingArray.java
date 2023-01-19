package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=5e1ce738-3090-4c62-a704-6565f15593d6
 */

import java.util.ArrayList;
import java.util.Scanner;

class Queue {

	ArrayList<Integer> que;
    public Queue() {
        que = new ArrayList<Integer>();
    }

    public void push(int newElement) {
        que.add(newElement);
    }
    public int pop() {
        int ele = que.get(0);
		que.remove(0);
		return ele;
    }
    public int front() {
        return (que.isEmpty()) ? -1 : que.get(0);
    }
    public int size() {
        return que.size();
    }
}

public class QueueUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
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
                System.out.println(q.size());
        }
        sc.close();
    }
}
