package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=45eae2bf-6488-4ec5-85ab-598fc10d1647
 */

import java.util.Scanner;

public class BalancedBinaryTree {
    static class Node {

        int data;
        Node left, right;
    }

    static Node getNode(int data) {
        // Allocate memory
        Node newNode = new Node();

        // put in the data
        newNode.data = data;
        newNode.left = newNode.right = null;
        return newNode;
    }

    // function to construct a BST from
    // its level order traversal
    static Node LevelOrder(Node root, int data) {
        if (root == null) {
            root = getNode(data);
            return root;
        }
        if (data <= root.data)
            root.left = LevelOrder(root.left, data);
        else
            root.right = LevelOrder(root.right, data);
        return root;
    }

    static Node constructBst(int arr[], int n) {
        if (n == 0)
            return null;
        Node root = null;

        for (int i = 0; i < n; i++)
            root = LevelOrder(root, arr[i]);

        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tree = new int[n];
        for (int i = 0; i < n; i++)
            tree[i] = sc.nextInt();
        sc.close();
        Node root = constructBst(tree, n);
        if (isBalanced(root))
            System.out.println("true");
        else
            System.out.println(
                    "false");
    }

    static class Pair {
        boolean bal;
        int height;

        Pair() {
            bal = true;
            height = 0;
        }

        Pair(boolean bal, int height) {
            this.bal = bal;
            this.height = height;
        }
    }

    private static boolean isBalanced(Node root) {
        Pair ans = height(root);

        return ans.bal;
    }

    private static Pair height(Node root) {
        if (root == null)
            return new Pair();

        Pair lh = height(root.left);
        Pair rh = height(root.right);

        int diff = Math.abs(lh.height - rh.height);

        if (diff > 1 || lh.bal == false || rh.bal == false)
            return new Pair(false, Math.max(lh.height, rh.height) + 1);
        else
            return new Pair(true, Math.max(lh.height, rh.height) + 1);
    }
}
