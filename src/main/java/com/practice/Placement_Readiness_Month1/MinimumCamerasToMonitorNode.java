package com.practice.Placement_Readiness_Month1;
/*
 * @Amresh Tripathy
 * https://leetcode.com/problems/binary-tree-cameras/
 * https://course.acciojob.com/idle?question=7b3236c6-eb31-4ee3-8145-80fba275086c
 */

import java.util.Scanner;
import com.practice.kunalkhuswah_DSA.BinaryTrees;
import com.practice.kunalkhuswah_DSA.TreeNode;

public class MinimumCamerasToMonitorNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        String[] arr = str.split(" ");
        BinaryTrees bt = new BinaryTrees(arr);
        System.out.println(minCameraCover(bt.root));
    }

    static int cameras = 0;
    private static int minCameraCover_helper(TreeNode root) {
        // -1 for required camera
        // 0 - self node is camera
        // 1 - covered by any camera
        if (root == null)
            return 1;

        int lc = minCameraCover_helper(root.left);
        int rc = minCameraCover_helper(root.right);

        if (lc == -1 || rc == -1) {
            cameras++;
            return 0;
        }

        if (lc == 0 || rc == 0)
            return 1;
        
        return -1;
    }

    private static int minCameraCover(TreeNode root) {

        if (minCameraCover_helper(root) == -1) // checking for head node
            cameras++;

        return cameras;
    }
}
