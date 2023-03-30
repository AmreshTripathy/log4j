package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTrees {

    public TreeNode root = null;

    public BinaryTrees(String[] arr) {
        if(arr.length == 0 || arr[0].equals("N"))
            return;
        
        root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;

        while (q.size() > 0 && i < arr.length) {
            TreeNode curNode = q.peek();
            q.remove();

            String curVal = arr[i];
            if(!curVal.equals("N")) {
                curNode.left = new TreeNode(Integer.parseInt(curVal));
                q.add(curNode.left);
            }
            i++;

            if (i >= arr.length)
                break;
            curVal = arr[i];
            if(!curVal.equals("N")) {
                curNode.right = new TreeNode(Integer.parseInt(curVal));
                q.add(curNode.right);
            }
            i++;
        }
    }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     String[] arr = new String[n];

    //     for(int i = 0; i < n; i++) 
    //         arr[i] = sc.next();
    //     sc.close();
        
    //     BinaryTrees br = new BinaryTrees(arr);
    //     System.out.println(br.root.data + " " + br.root.left.data + " " + br.root.right.data);
    // }
}
