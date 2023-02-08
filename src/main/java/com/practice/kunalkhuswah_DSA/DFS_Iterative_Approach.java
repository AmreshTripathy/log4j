package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class DFS_Iterative_Approach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BST t = new BST();

        for (int i = 0; i < n; i++)
            t.root = t.insert(t.root, sc.nextInt());

        sc.close();
        printDFS(t.root);
    }

    static class Pair {
        TreeNode root;
        int stage;

        Pair(TreeNode root, int stage) {
            this.root = root;
            this.stage = stage;
        }
    }

    private static void printDFS(TreeNode root) {
        ArrayList<Integer> pre = new ArrayList<>();
        ArrayList<Integer> in = new ArrayList<>();
        ArrayList<Integer> post = new ArrayList<>();

        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root, 1));

        while (st.size() > 0) {
            Pair top = st.peek();

            if (top.stage == 1) {
                // preOrder
                pre.add(top.root.data);
                top.stage++;
                if(top.root.left != null) 
                    st.push(new Pair(top.root.left, 1));
            }else if (top.stage == 2) {
                // inOrder
                in.add(top.root.data);
                top.stage++;
                if(top.root.right != null)
                    st.push(new Pair(top.root.right, 1));
            }else {
                // postOrder
                post.add(top.root.data);
                st.pop();
            }
        }
        
        System.out.println(pre + "\n" + in + "\n" + post);
    }
}
