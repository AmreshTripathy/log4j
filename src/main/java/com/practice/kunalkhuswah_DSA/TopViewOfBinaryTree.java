package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=2e9cb785-6601-4de7-90c3-0e79638c9f5b
 */

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TopViewOfBinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");
        sc.close();

        BinaryTrees bst = new BinaryTrees(arr);

        ArrayList<Integer> lis = topView(bst.root);
        System.out.println(lis);
    }

    static int maxLevel;
    static int minLevel;

    static class Pair implements Comparable<Pair> {
        TreeNode node;
        int vLevel;

        Pair(TreeNode node, int vLevel) {
            this.node = node;
            this.vLevel = vLevel;
        }

        @Override

        public int compareTo(Pair o) {
            if (this.vLevel == o.vLevel) {
                return this.node.data - o.node.data;
            }
            return this.vLevel - o.vLevel;
        }
    }

    public static void vLevelTraversal(TreeNode root, int level) {
        if (root == null)
            return;
        vLevelTraversal(root.left, level - 1);
        vLevelTraversal(root.right, level + 1);

        minLevel = Math.min(level, minLevel);
        maxLevel = Math.max(level, maxLevel);

    }

    static ArrayList<Integer> topView(TreeNode root) {
        // Write your code here
        maxLevel = 0;
        minLevel = 0;
        vLevelTraversal(root, 0);
        ArrayList<Integer> tv = new ArrayList<>();
        int width = maxLevel - minLevel;
        int numberOfLevels = width + 1;

        for (int i = 0; i < numberOfLevels; i++) {
            tv.add(Integer.MIN_VALUE);
        }

        PriorityQueue<Pair> Ppq = new PriorityQueue<>();
        Ppq.add(new Pair(root, -minLevel));

        while (Ppq.size() > 0) {
            int size = Ppq.size();
            PriorityQueue<Pair> Cpq = new PriorityQueue<>();

            while (size > 0) {
                Pair rPair = Ppq.remove();

                if(tv.get(rPair.vLevel) == Integer.MIN_VALUE)
                    tv.set(rPair.vLevel, rPair.node.data);

                if (rPair.node.left != null) {
                    Cpq.add(new Pair(rPair.node.left, rPair.vLevel - 1));
                }
                if (rPair.node.right != null) {
                    Cpq.add(new Pair(rPair.node.right, rPair.vLevel + 1));
                }
                size--;
            }

            Ppq = Cpq;

        }

        return tv;
    }
}
