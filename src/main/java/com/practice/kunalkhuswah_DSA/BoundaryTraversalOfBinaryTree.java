package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=52812c95-8480-4304-b0b2-9b73ba1ae7c8
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BoundaryTraversalOfBinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");
        sc.close();

        BinaryTrees bst = new BinaryTrees(arr);
        printBoundary(bst.root);
    }

    private static void printBoundary(TreeNode root) {
        Queue<Integer> q = new LinkedList<>();
        if (root == null || isLeafNode(root))
            return;
        q.add(root.data);
        addLeftBoundary(root, q); // adding left nodes
        addLeafNodes(root, q); // adding leaf nodes
        addRightBoundary(root, q); // adding right nodes and reversing it

        while (q.size() > 0)
            System.out.print(q.remove() + " ");
    }

    private static void addLeftBoundary(TreeNode root, Queue<Integer> q) {
        TreeNode temp = root.left;

        while (temp != null) {
            if (!isLeafNode(temp)) 
                q.add(temp.data);
            
            if (temp.left != null)
                temp = temp.left;
            else
                temp = temp.right;
        }
    }

    private static void addLeafNodes(TreeNode root, Queue<Integer> q) {
        if(isLeafNode(root)) {
            q.add(root.data);
            return;
        }

        if (root.left != null) addLeafNodes(root.left, q);
        if (root.right != null) addLeafNodes(root.right, q);
    }

    private static void addRightBoundary(TreeNode root, Queue<Integer> q) {
        Stack<Integer> st = new Stack<>();
        TreeNode temp = root.right;

        while (temp != null) {
            if(!isLeafNode(temp))
                st.push(temp.data);
            
            if(temp.right != null)
                temp = temp.right;
            else
                temp = temp.left;
        }

        while (st.size() > 0)
            q.add(st.pop());
    }

    private static boolean isLeafNode(TreeNode root) {
        return (root.left == null && root.right == null) ? true : false;
    }
}
