package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=42edeaa6-2952-42d2-92fb-d374e5f67445
 * https://leetcode.com/problems/balance-a-binary-search-tree/description/
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BalanceABinarySearchTree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    } 
    
    static class pair {
        int first;
        int second;
        pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }
    static void printInorder(Node root) {
        if (root == null) return;

        printInorder(root.left);
        System.out.print(root.data + " ");

        printInorder(root.right);
    }

    public static boolean isBalanced(Node root)
    {
        if(root==null){ return true;}

        if(!isBalanced(root.left)|| !isBalanced(root.right))return false;

        if(Math.abs(height(root.left)- height(root.right))<=1){return true;};

        return false;
    }

    public static int height(Node root){
        if(root== null){
            return 0;}
         return Math.max(  height(root.left), height(root.right))+1;
        }

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);

    
        String s = br.readLine();
        Node root = buildTree(s);
        Node duplicate = buildTree(s);

        root = balanceBST(root);
        boolean ans=isBalanced(root);

        if(ans==true)
        System.out.println(1);
        else
        System.out.println(0);
        
    }

    public static Node balanceBST(Node root) {
        // your code here
        List<Integer> lis = new ArrayList<>();
        inOrder(root, lis);

        root = buildBST(lis, 0, lis.size() - 1);
        return root;
    }

    private static Node buildBST(List<Integer> lis, int i, int j) {
        if (i > j)
            return null;
        
        int mid = (i + j) / 2;
        
        Node root = new Node(lis.get(mid));

        root.left = buildBST(lis, i, mid - 1);
        root.right = buildBST(lis, mid + 1, j);

        return root;
    }

    private static void inOrder(Node root, List<Integer> lis) {
        if(root == null)
            return;

        inOrder(root.left, lis);
        lis.add(root.data);
        inOrder(root.right, lis);
    }
}
