package com.practice.Placement_Readiness_Month1;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=4e10f131-e0bd-49a2-baa5-3111ed5e0f3b
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class AlienDictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];

        for (int i = 0; i < n; i++)
            words[i] = sc.next();

        sc.close();

        System.out.println(findOrder(words));
    }

    private static String findOrder(String[] words) {

        int n = words.length;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < 27; i++)
            graph.add(new ArrayList<>());

        for (int i = 0; i < n - 1; i++) {
            String s1 = words[i];
            String s2 = words[i + 1];

            int min_length = Math.min(s1.length(), s2.length());

            for (int j = 0; j < min_length; j++) {
                if (s1.charAt(j) != s2.charAt(j)) {
                    graph.get(s1.charAt(j) - 'a').add(s2.charAt(j) - 'a');
                    break;
                }
            }
        }

        List<Integer> topo = topologicalSort(graph);

        String ans = "";
        for (int index : topo) {
            ans += (char) (index + (int) 'a');
        }

        return (ans.length() > 0) ? ans : words[0];
    }

    private static List<Integer> topologicalSort(ArrayList<ArrayList<Integer>> graph) {

        int[] indegree = new int[27];
        for (int i = 0; i < 27; i++) {
            if (!graph.get(i).isEmpty()) {
                for (int ele : graph.get(i))
                    indegree[ele]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 27; i++) {
            if (!graph.get(i).isEmpty() && indegree[i] == 0)
                q.add(i);
        }

        List<Integer> lis = new ArrayList<>();

        while (q.size() > 0) {
            int node = q.poll();
            lis.add(node);

            for (int nbr : graph.get(node)) {
                indegree[nbr]--;
                if (indegree[nbr] == 0)
                    q.add(nbr);
            }
        }

        return lis;
    }
}
