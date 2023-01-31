package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=73dc7bdc-712a-4d18-b043-4a23ff720e30
 */

import java.util.Scanner;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    static class Node{
        int data; 
        Node left, right;
        Node(int key){
            data = key;
            left = right = null;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node root = null;
        int inorder[] = new int[n];
        int preorder[] = new int[n];
        for (int i = 0; i < n; i++)
            preorder[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            inorder[i] = sc.nextInt();
        sc.close();

        root = buildTree(inorder, preorder);
        postOrdrer(root);
        System.out.println();
    }

    public static void postOrdrer(Node root){
        if(root == null)
          return;
        postOrdrer(root.left);
        postOrdrer(root.right);
        System.out.print(root.data + " ");
    }

    static Node constructTree(int[] preorder, int psi, int pei, int[] inorder, int isi, int iei) {
        if (psi > pei) {
            return null;
        }

        if (isi > iei) {
            return null;
        }

        Node root = new Node(preorder[psi]);

        int val = preorder[psi];
        int itr = isi;
        int cntElements = 0;
        while (inorder[itr] != val) {
            cntElements++;
            itr++;
        }

        root.left = constructTree(preorder, psi + 1, psi + cntElements, inorder, isi, itr - 1);
        root.right = constructTree(preorder, psi + cntElements + 1, pei, inorder, itr + 1, iei);

        return root;
    }

    static public Node buildTree(int[] inorder, int[] preorder) {
        return constructTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
}
