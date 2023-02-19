package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class ConstructBSTFromPostorderTraversal {
    public static Scanner scn = new Scanner(System.in);

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static int idx;

    public static TreeNode CreateTree(int n, int[] preOrder) {
        // Write Your Code here
        idx = preOrder.length - 1;
        TreeNode root = construct(preOrder, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return root;
    }

    // input_section=================================================

    private static TreeNode construct(int[] preOrder, int minValue, int maxValue) {
        if (idx == -1)
            return null;

        if (preOrder[idx] <= minValue || preOrder[idx] >= maxValue)
            return null;

        TreeNode nd = new TreeNode(preOrder[idx]);

        idx--;
        nd.right = construct(preOrder, nd.val, maxValue);
        nd.left = construct(preOrder, minValue, nd.val);

        return nd;
    }

    public static void display(TreeNode node) {
        if (node == null)
            return;
        StringBuilder sb = new StringBuilder();
        sb.append((node.left != null ? node.left.val : "."));
        sb.append("->" + node.val + "<-");
        sb.append((node.right != null ? node.right.val : "."));
        System.out.println(sb.toString());
        display(node.left);
        display(node.right);

    }

    public static void solve() {
        int n = scn.nextInt();
        int[] pre = new int[n];
        for (int i = 0; i < n; i++)
            pre[i] = scn.nextInt();

        TreeNode root = CreateTree(n, pre);
        display(root);
    }

    public static void main(String[] args) {
        solve();
    }
}
