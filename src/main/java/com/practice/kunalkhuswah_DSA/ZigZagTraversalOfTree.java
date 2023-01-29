package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=fa5f5548-8224-452e-8531-49dbbf53f5f5
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class ZigZagTraversalOfTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");
        sc.close();

        BinaryTrees bst = new BinaryTrees(arr);
        binaryTreeZigZagTraversal(bst.root);
    }

    private static void binaryTreeZigZagTraversal(TreeNode root) {
        if (root == null)
            return;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<Integer> lis = new ArrayList<>();
        int count = 0;
        while (q.size() > 0) {
            int size = q.size();
            List<Integer> lis1 = new ArrayList<>();
            while (size > 0) {
                TreeNode temp = q.remove();
                lis1.add(temp.data);
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
                size--;
            }

            if(count % 2 == 0)
                lis.addAll(lis1);
            else {
                Collections.reverse(lis1);
                lis.addAll(lis1);
            }
            count++;
        }

        for(int ele: lis)
            System.out.print(ele + " ");
    }
}
