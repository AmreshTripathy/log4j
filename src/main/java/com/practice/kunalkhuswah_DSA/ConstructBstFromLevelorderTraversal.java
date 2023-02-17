package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=78d88a42-f9ae-4454-a580-518034855d54
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ConstructBstFromLevelorderTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = sc.nextInt();

        TreeNode ans = bstFromLevel(arr, n);
        BST t = new BST();
        t.inOrderPrint(ans);

        sc.close();
    }

    static class Pair {
        TreeNode parent;
        int max, min;

        Pair(TreeNode p, int min, int max) {
            parent = p;
            this.min = min;
            this.max = max;
        }
    }

    private static TreeNode bstFromLevel(int[] arr, int n) {
        // In level order first node is always root node -> so creating a node with arr[0] element

        TreeNode root = new TreeNode(arr[0]);

        // creating a Pair so we can store parent of the node and it's min & max limit
        Queue<Pair> q = new LinkedList<>();
        
        /*
         * Ex: 3 2 5 1 6 7
         * 
         * for 3:   min ->    3         max ->      3
         *               -inf   3               3       +inf
         * 
         * for 2:   min ->      2       max ->      2
         *                -inf      2           2       +inf
        */

        q.add(new Pair(root, Integer.MIN_VALUE, arr[0]));
        q.add(new Pair(root, arr[0], Integer.MAX_VALUE));

        int idx = 1;
        while (q.size() > 0) {
            Pair front = q.remove();

            if (idx == n)
                continue;
            
            if (arr[idx] <= front.min || arr[idx] >= front.max)
                continue;

            TreeNode nd = new TreeNode(arr[idx]);
            idx++;

            if(nd.data < front.parent.data)
                front.parent.left = nd;
            else
                front.parent.right = nd;

            q.add(new Pair(nd, front.min, nd.data));
            q.add(new Pair(nd, nd.data, front.max));
            
        }

        return root;
    }
}
