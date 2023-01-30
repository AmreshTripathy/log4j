package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/maximum-width-of-binary-tree/
 */

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class VerticalOrderTraversalOfBinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");
        sc.close();

        BinaryTrees bst = new BinaryTrees(arr);

        List<List<Integer>> lis = VerticalTraversal(bst.root);
        System.out.println(lis);
    }

    static int maxLevel = 0;
    static int minLevel = 0;

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

    static List<List<Integer>> VerticalTraversal(TreeNode root) {
        // Write your code here
        vLevelTraversal(root, 0);
        List<List<Integer>> vertical = new ArrayList<>();
        int width = maxLevel - minLevel;
        int numberOfLevels = width + 1;

        for (int i = 0; i < numberOfLevels; i++) {
            vertical.add(new ArrayList<>());
        }

        PriorityQueue<Pair> Ppq = new PriorityQueue<>();
        Ppq.add(new Pair(root, -minLevel));

        while (Ppq.size() > 0) {
            int size = Ppq.size();
            PriorityQueue<Pair> Cpq = new PriorityQueue<>();

            while (size > 0) {
                Pair rPair = Ppq.remove();

                vertical.get(rPair.vLevel).add(rPair.node.data);

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

        return vertical;
    }
}
