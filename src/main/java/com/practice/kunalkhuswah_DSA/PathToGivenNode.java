package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=a6cd9b9f-b898-4093-bcd6-de49aff55f4b
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PathToGivenNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int b = sc.nextInt();
        sc.close();

        BinaryTrees bst = new BinaryTrees(arr);
        System.out.println(solve(bst.root, b));
    }

    static ArrayList<Integer> lis;
    private static ArrayList<Integer> solve(TreeNode root, int b) {
        lis = new ArrayList<>();
        findTarget(root, b);
        Collections.reverse(lis);
        return lis;
    }

    private static boolean findTarget(TreeNode root, int b) {
        if(root == null)
            return false;

        if(root.data == b) {
            lis.add(root.data);
            return true;
        }
        
        boolean findLeft = findTarget(root.left, b);
        if(findLeft) {
            lis.add(root.data);
            return true;
        }
        boolean findRight = findTarget(root.right, b);
        if(findRight) {
            lis.add(root.data);
            return true;
        }

        return false;
    }
}
