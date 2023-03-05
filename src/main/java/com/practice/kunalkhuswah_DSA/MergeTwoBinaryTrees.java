package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=11d019ea-0558-470c-b63c-d5dd23e03afa
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MergeTwoBinaryTrees {

    static class Node {
        int data;
        Node left, right;

        public Node(int d) {
            data = d;
            left = right = null;
        }
    }

    public static Node buildTree(String str){
        if(str.length() == 0 || str.equals("N"))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        int i = 1;
        while(!q.isEmpty() && i < s.length){
              Node currNode = q.remove();
              String currVal = s[i];
              if(!currVal.equals("N")) {
                  currNode.left = new Node(Integer.parseInt(currVal));
                  q.add(currNode.left);
              }
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
              if(!currVal.equals("N")){
                  currNode.right = new Node(Integer.parseInt(currVal));
                  q.add(currNode.right);
              }
              i++;
        }
        return root;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Node root1 = buildTree(s);

        s = br.readLine();
        Node root2 = buildTree(s);

        List<Integer> ans = merge(root1, root2);
        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");
        System.out.println();
    }

    public static List<Integer> merge(Node root1, Node root2) {
        // Write your code here
        return null;
    }
}
