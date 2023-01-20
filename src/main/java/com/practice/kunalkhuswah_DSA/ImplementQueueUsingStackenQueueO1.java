package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://www.youtube.com/watch?v=3Et9MrMc02A
 * https://course.acciojob.com/idle?question=89a5f158-cacc-427d-a317-0967668d8f2b
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ImplementQueueUsingStackenQueueO1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackQueue s = new StackQueue();
        int q = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        while (q > 0) {
            int QueryType = sc.nextInt();
            if (QueryType == 1) {
                int a = sc.nextInt();
                s.Push(a);
            } else if (QueryType == 2)
                ans.add(s.Pop());
            q--;
        }
        for (int x : ans)
            System.out.print(x + " ");
        System.out.println();
        sc.close();
    }
}

class StackQueue
{
    Stack<Integer> stk1;
    StackQueue() {
        stk1 = new Stack<>();
    }
    
    // first s1 -> s2 (line no. 53)
    // x -> s1 -> (line no. 58)
    // s2 -> s1 -> (line no. 60)
    void Push(int x)
    {
        // if empty add first element
        if(stk1.isEmpty()) {
            stk1.push(x);
            return;
        }

        // creating another stack to add x and adding all elements from stk1 to stk2 one by one
        Stack<Integer> stk2 = new Stack<>();

        while(stk1.size() > 0)
            stk2.push(stk1.pop());

        stk1.push(x);

        while(stk2.size() > 0)
            stk1.push(stk2.pop());
    }
    //Function to pop an element from queue by using 2 stacks.
    int Pop()
    {
	   return (stk1.isEmpty()) ? -1: stk1.pop();
    }
}