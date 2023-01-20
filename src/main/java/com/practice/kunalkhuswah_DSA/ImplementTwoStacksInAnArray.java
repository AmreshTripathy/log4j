package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://www.youtube.com/watch?v=S4mBBDfvWCE
 * https://course.acciojob.com/idle?question=b47e7025-826e-48d5-ab1c-345bc0a1687b
 */

import java.util.Scanner;

public class ImplementTwoStacksInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        twoStacks ts = new twoStacks(n);
        for(int i =0; i<n; i++){
            int temp;
            temp = sc.nextInt();
            if(temp == 1) ts.pop1();
            else if(temp==3) ts.pop2();
            else if(temp == 2) {
                int temp2;
                temp2 = sc.nextInt();
                ts.push1(temp2);
            }
            else{
                int temp2;
                temp2 = sc.nextInt();
                ts.push2(temp2);
            }
        }
        sc.close();
    }
}

class twoStacks {
	int[] arr;
	int size;
	int top1, top2;

	// Constructor
	twoStacks(int n)
	{
		size = n;
		arr = new int[n];
		top1 = -1; // starting one point at start
		top2 = n;  // starting one point from the last
	}

	// Method to push an element x to stack1
	void push1(int x)
	{
        if(top1 + 1 == top2) // if at any point top1 & top2 collide then stck1 is full return
            return;
        // adding elements from the first to last dirextion -->
        top1++;
        arr[top1] = x;
	}

	// Method to push an element
	// x to stack2
	void push2(int x)
	{
        if(top2 - 1 == top1) // if at any point top2 & top1 collide then stck1 is full return
            return;
        // adding elements from the last to first direction <--
        top2--;
        arr[top2] =x;
	}

	// Method to pop an element from first stack
	void pop1()
	{
		if(top1 == -1) {
            System.out.println(-1);
            return;
        }
        System.out.println(arr[top1]);
        top1--;
	}

	// Method to pop an element
	// from second stack
	void pop2()
	{
		if(top2 == size) {
            System.out.println(-1);
            return;
        }
        System.out.println(arr[top2]);
        top2++;
	}
}