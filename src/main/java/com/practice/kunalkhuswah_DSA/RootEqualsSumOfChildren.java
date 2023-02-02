package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=078031e9-9e7d-42e3-8d08-3ab2cdcc2686
 */

import java.util.Scanner;

public class RootEqualsSumOfChildren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        sc.close();
        BinaryTrees bst = new BinaryTrees(arr);
        System.out.println(checkTree(bst.root));
    }

    private static boolean checkTree(TreeNode root) {
        return (root.data == root.left.data + root.right.data);
    }
}
