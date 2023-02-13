package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=8b9059a2-281c-4f68-b038-6e7cd889f558
 */

import java.util.Scanner;
import java.util.Stack;

public class TwoSumInBST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        BST t = new BST();

        for (int i = 0; i < n; i++)
            t.root = t.insert(t.root, sc.nextInt());

        sc.close();
        System.out.println(checkTarget(t.root, k));
    }

    static class Pair {
        TreeNode node;
        int state;

        Pair(TreeNode node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    private static boolean checkTarget(TreeNode root, int k) {
        Stack<Pair> normal = new Stack<>();
        Stack<Pair> reverse = new Stack<>();

        normal.push(new Pair(root, 1));
        reverse.push(new Pair(root, 1));

        TreeNode left = getNormalInOrder(normal);
        TreeNode right = getReverseInOrder(reverse);

        while (left.data < right.data) {
            if (left.data + right.data == k)
                return true;
            else if (left.data + right.data < k)
                left = getNormalInOrder(normal);
            else
                right = getReverseInOrder(reverse);
        }

        return false;
    }

    private static TreeNode getNormalInOrder(Stack<Pair> st) {

        while (st.size() > 0) {
            Pair top = st.peek();

            if (top.state == 1) {
                top.state++;
                if (top.node.left != null)
                    st.push(new Pair(top.node.left, 1));
            } else if (top.state == 2) {
                top.state++;
                if (top.node.right != null)
                    st.push(new Pair(top.node.right, 1));
                return top.node;
            } else {
                st.pop();
            }
        }

        return null;
    }

    private static TreeNode getReverseInOrder(Stack<Pair> st) {
        while (st.size() > 0) {
            Pair top = st.peek();

            if (top.state == 1) {
                top.state++;
                if (top.node.right != null)
                    st.push(new Pair(top.node.right, 1));
            } else if (top.state == 2) {
                top.state++;
                if (top.node.left != null)
                    st.push(new Pair(top.node.left, 1));
                return top.node;
            } else {
                st.pop();
            }
        }

        return null;
    }
}
