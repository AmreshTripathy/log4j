package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=0dd4bc90-7cd3-45f8-bd73-81ada8c52c67
 */

import java.util.Scanner;
import java.util.Stack;

public class TargetSumPairInBst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BST t = new BST();

        for (int i = 0; i < n; i++)
            t.root = t.insert(t.root, sc.nextInt());

        int tar = sc.nextInt();
        sc.close();
        targetSum(t.root, tar);
    }

    static class Pair {
        TreeNode root;
        int state;

        Pair(TreeNode root, int state) {
            this.root = root;
            this.state = state;
        }
    }

    private static void targetSum(TreeNode root, int tar) {
        Stack<Pair> normal = new Stack<>(); // stack for normal iteration
        Stack<Pair> reverse = new Stack<>(); // stack for reverse iteration

        normal.push(new Pair(root, 1));
        reverse.push(new Pair(root, 1));

        TreeNode left = getNextFromNormal(normal); // next inorder node in normal traversal
        TreeNode right = getNextFromReverse(reverse); // next inorder node in reverse traversal
        boolean printed = false;

        while (left.data < right.data) {
            if (left.data + right.data == tar) {
                printed = true;
                System.out.println(left.data + " " + right.data);
                left = getNextFromNormal(normal);
                right = getNextFromReverse(reverse);
            } else if (left.data + right.data < tar) {
                left = getNextFromNormal(normal);
            } else {
                right = getNextFromReverse(reverse);
            }
        }

        if (!printed)
            System.out.println(-1);
    }

    private static TreeNode getNextFromNormal(Stack<Pair> st) {

        while (st.size() > 0) {
            Pair top = st.peek();

            if (top.state == 1) {
                top.state++;
                if (top.root.left != null)
                    st.add(new Pair(top.root.left, 1));
            } else if (top.state == 2) {
                top.state++;
                if (top.root.right != null)
                    st.add(new Pair(top.root.right, 1));

                return top.root;
            } else {
                st.pop();
            }
        }

        return null;
    }

    private static TreeNode getNextFromReverse(Stack<Pair> st) {
        while (st.size() > 0) {
            Pair top = st.peek();

            if (top.state == 1) {
                top.state++;
                if (top.root.right != null)
                    st.add(new Pair(top.root.right, 1));
            } else if (top.state == 2) {
                top.state++;
                if (top.root.left != null)
                    st.add(new Pair(top.root.left, 1));

                return top.root;
            } else {
                st.pop();
            }
        }

        return null;
    }
}
