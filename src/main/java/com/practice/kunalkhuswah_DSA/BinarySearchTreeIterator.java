package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=2f242f0c-3aed-42a0-a92f-65113c853215
 */

import java.util.Scanner;
import java.util.Stack;

public class BinarySearchTreeIterator {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static class BSTIterator {
        static class Pair {
            TreeNode root;
            int stage;

            Pair(TreeNode root, int stage) {
                this.root = root;
                this.stage = stage;
            }
        }

        static Stack<Pair> st;

        public BSTIterator(TreeNode root) {
            // Your code here
            st = new Stack<>();
            st.add(new Pair(root, 1));
        }

        public int next() {
            // Your code here

            while (st.size() > 0) {
                Pair temp = st.peek();

                if (temp.stage == 1) {
                    // preorder
                    temp.stage++;
                    if (temp.root.left != null)
                        st.add(new Pair(temp.root.left, 1));
                } else if (temp.stage == 2) {
                    // inorder
                    st.pop();
                    temp.stage++;
                    if (temp.root.right != null)
                        st.add(new Pair(temp.root.right, 1));

                    return temp.root.val;
                }
            }

            return -1;
        }

        public boolean hasNext() {
            // Your code here
            return st.size() > 0;
        }
    }

    public static void display(TreeNode node) {
        if (node == null)
            return;
        StringBuilder sb = new StringBuilder();
        sb.append((node.left != null ? node.left.val : "."));
        sb.append(" -> " + node.val + " <- ");
        sb.append((node.right != null ? node.right.val : "."));
        System.out.println(sb.toString());
        display(node.left);
        display(node.right);

    }

    public static TreeNode constructFromInOrder_(int[] in, int si, int ei) {
        if (si > ei)
            return null;
        int mid = (si + ei) / 2;
        TreeNode node = new TreeNode(in[mid]);
        node.left = constructFromInOrder_(in, si, mid - 1);
        node.right = constructFromInOrder_(in, mid + 1, ei);
        return node;
    }

    public static void solve() {
        int n = scn.nextInt();
        int[] in = new int[n];
        for (int i = 0; i < n; i++)
            in[i] = scn.nextInt();
        TreeNode root = constructFromInOrder_(in, 0, in.length - 1);
        BSTIterator itr = new BSTIterator(root);
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
