package com.practice.Placement_Readiness_Month2;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=775f2cc3-6262-45bf-b2ba-a92d983b4b01
 */

import java.util.Scanner;

public class KthAncestorOfATreeNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int parent[] = new int[n];
        for (int i = 0; i < n; i++)
            parent[i] = sc.nextInt();
        int node = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(kthAncestor(n, parent, node, k));
        sc.close();
    }

    private static int kthAncestor(int n, int[] parent, int node, int k) {

        // here k might go upto 10^5 positions
        // So 2^17 = 1,31,072 and greater than 10^5, let's take max = 17
        int max = 17;

        // So k can not be greater than equal to 17
        if (k >= 17)
            return -1;

        // Creating a table to store all parents upto 17th stage
        int[][] table = new int[max][n];

        // for 0th row parents are given parents in question
        for (int i = 0; i < n; i++)
            table[0][i] = parent[i];

        // We need to find upto 16th stage for every n nodes
        for (int i = 1; i < max; i++) {
            // find the parent of the node and again that's parent's parent, it gives the
            // parent of current node
            for (int j = 0; j < n; j++) {
                if (table[i - 1][j] == -1) {
                    table[i][j] = -1;
                    continue;
                }
                table[i][j] = table[i - 1][table[i - 1][j]];
            }
        }

        // now after storing all parents row wise, we find the parent of any node's kth
        // ancestor
        // We use Bit Manipulation.
        // By checking 1 bit's position in kth number by one by one stage
        // k = 9; 9 -> 1011 --> So we find 3rd, 1st, 0th parent's to find kth parent
        for (int i = 0; i < max; i++) {
            // creating mask stage wise
            int mask = 1 << i;
            if ((k & mask) > 0) {// means set
                node = table[i][node];
                if (node == -1)
                    return node;
            }
        }

        return node;
    }
}
