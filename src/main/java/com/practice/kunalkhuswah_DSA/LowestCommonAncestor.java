package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=978382d5-aa6d-4dee-8a1a-b9bda9cd2ddc
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();

        BinaryTrees bst = new BinaryTrees(arr);
        System.out.println(findLCA(bst.root, n1, n2).data);
    }

    public static TreeNode findLCA(TreeNode node, int n1, int n2) {
        ArrayList<TreeNode> lis1 = solve(node, n1);
        ArrayList<TreeNode> lis2 = solve(node, n2);

        int i = 0, j =  0;

        TreeNode lca = new TreeNode("-1");
        
        while(i < lis1.size() && j < lis2.size() && lis1.get(i) == lis2.get(i)) {
            lca = lis1.get(i);
            i++;
            j++;
        }
        
        return lca;
    }

    static ArrayList<TreeNode> lis;

    private static ArrayList<TreeNode> solve(TreeNode root, int b) {
        lis = new ArrayList<>();
        findTarget(root, b);
        Collections.reverse(lis);
        return lis;
    }

    private static boolean findTarget(TreeNode root, int b) {
        if (root == null)
            return false;

        if (root.data == b) {
            lis.add(root);
            return true;
        }

        boolean findLeft = findTarget(root.left, b);
        if (findLeft) {
            lis.add(root);
            return true;
        }
        boolean findRight = findTarget(root.right, b);
        if (findRight) {
            lis.add(root);
            return true;
        }

        return false;
    }
}
