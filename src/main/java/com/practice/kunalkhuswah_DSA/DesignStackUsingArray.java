package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=6741eaff-749d-4bef-a8c9-7c768de975a0
 */

import java.util.ArrayList;
import java.util.Scanner;

public class DesignStackUsingArray {
    public static void main(String[] args) {
        StackUsingArrayList obj = new StackUsingArrayList();
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
                obj.display();
            }
        }
        sc.close();
    }
}

class StackUsingArrayList {

    ArrayList<Integer> st;

    StackUsingArrayList() {
        st = new ArrayList<Integer>();
    }

    public void push(int x) {
        st.add(0, x);
    }

    public int peek() {
        return (st.size() == 0) ? -1 : st.get(0);
    }

    public void pop() {
        if(st.isEmpty())
			return;
		st.remove(0);
    }

    public void display() {
        for(int num: st)
			System.out.print(num + " ");
		System.out.println();
    }
}