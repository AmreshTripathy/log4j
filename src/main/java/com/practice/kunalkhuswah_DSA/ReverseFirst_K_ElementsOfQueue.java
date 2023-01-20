package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=a43a8fee-7bba-4cb7-9691-9172b3716b9b
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseFirst_K_ElementsOfQueue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), k = input.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            q.add(input.nextInt());
        }
        input.close();
        // write code here
		Stack<Integer> st = new Stack<>();
		while(k-- > 0) {
			st.push(q.remove());
		}
		Queue<Integer> ans = new LinkedList<>();
		while(st.size() > 0)
			ans.add(st.pop());
		while(q.size() > 0)
			ans.add(q.remove());
        while(ans.size() > 0){
            System.out.print(ans.poll() + " ");
        }
    }
}
