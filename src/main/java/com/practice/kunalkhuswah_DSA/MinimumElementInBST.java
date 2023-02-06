package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=8ff8e1b8-b718-47b4-9455-06b354499a8c
 */

import java.util.Scanner;

public class MinimumElementInBST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BST t = new BST();

        for (int i = 0; i < n; i++)
            t.root = t.insert(t.root, sc.nextInt());

        sc.close();
        
        System.out.println(minimumNode(t.root));
    }

    public static int minimumNode(TreeNode root){
		TreeNode temp = root;

		while (temp.left != null)
			temp = temp.left;

		return temp.data;
    }
}
