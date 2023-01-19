package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://www.youtube.com/watch?v=jDZQKzEtbYQ
 * https://course.acciojob.com/idle?question=06476864-88f7-478c-bff1-94797c7556b1
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ImplementStackUsingQueuePushO1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack g = new Stack();
        int q = sc.nextInt();
        while (q > 0) {
            int QueryType = sc.nextInt();
            if (QueryType == 1) {
                int a = sc.nextInt();
                g.push(a);
            } else if (QueryType == 2) {
                System.out.print(g.pop() + " ");
            }
            q--;
        }
        sc.close();
    }
}

class Stack
{
    Queue<Integer> que1;
    Stack() {  que1 = new LinkedList<>(); }
    void push(int a)
    {
        if(que1.isEmpty() == false) {
            Queue<Integer> que2 = new LinkedList<>();
            que2.add(a);
            
            while (que1.isEmpty() == false) {
                que2.add(que1.remove());
            }
            que1 = que2;
        }else
            que1.add(a);
    }
    
    int pop()
    {
        return (que1.isEmpty()) ? -1 : que1.remove();
    }	
}