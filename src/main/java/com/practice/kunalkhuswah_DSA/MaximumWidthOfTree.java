package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=f74897ab-cbb8-4302-b031-f69c5d31c1ea
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MaximumWidthOfTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");
        sc.close();

        BinaryTrees bst = new BinaryTrees(arr);
        System.out.println(solve(bst.root));
    }

    static class Pair {
        TreeNode node;
        int idx;

        Pair (TreeNode node, int idx) {
            this.node = node;
            this.idx = idx;
        }
    }
    
    private static int solve(TreeNode root) {
        if(root == null)
            return 0;

        int maxWidth = 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 1));

        while (q.size() > 0) {
            int size = q.size();
            int first = -1;
            int last = -1;
            while (size > 0) {
                Pair temp = q.remove();
                if(first == -1)
                    first = temp.idx;
                if(temp.node.left != null)
                    q.add(new Pair(temp.node.left, 2 * temp.idx));
                if(temp.node.right != null)
                    q.add(new Pair(temp.node.right, (2 * temp.idx) + 1));
                
                size--;
                if(size == 0)
                    last = temp.idx;
            }
            maxWidth = Math.max(maxWidth, last - first + 1);
         }

        return maxWidth;
    }
}
