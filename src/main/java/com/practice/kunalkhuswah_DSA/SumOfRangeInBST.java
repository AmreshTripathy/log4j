package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=a429b9c2-b596-426b-a197-72aeb9a5bb23
 */

import java.util.Scanner;

public class SumOfRangeInBST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        BST t = new BST();

        for (int i = 0; i < n; i++)
            t.root = t.insert(t.root, sc.nextInt());

        sc.close();

        System.out.println(rangeSum(t.root, l, r));
    }

    private static long rangeSum(TreeNode root, int l, int r) {
        if(root == null)
            return 0;
        
        if (l <= root.data && root.data <= r)
            return root.data + rangeSum(root.left, l, r) + rangeSum(root.right, l, r);
        else if (root.data < l)
            return rangeSum(root.right, l, r);
        else
            return rangeSum(root.left, l, r);
    }
}
