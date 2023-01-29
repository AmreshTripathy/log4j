package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=87b0d2e6-d58a-4149-a832-70355e59043b
 */

import java.util.Scanner;

public class DiameterOfABinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");
        sc.close();

        BinaryTrees bst = new BinaryTrees(arr);
        System.out.println(diameter(bst.root));
    }

    static class Pair {
        int height;
        int diameter;

        Pair() {
            this.height = 0;
            this.diameter = 0;
        }

        Pair(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    private static int diameter(TreeNode root) {
        Pair dia = findDiameter(root);

        return dia.diameter;
    }

    private static Pair findDiameter(TreeNode root) {
        if(root == null)
            return new Pair();

        Pair lh = findDiameter(root.left);
        Pair rh = findDiameter(root.right);

        int height = Math.max(lh.height, rh.height) + 1;
        int diameter = lh.height + rh.height + 1;
        int maxDiameter = Math.max(diameter, Math.max(lh.diameter, rh.diameter));

        return new Pair(height, maxDiameter);
    }
}
