package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=696e11ef-b9f2-4691-889a-2b22d7c97076
 */

import java.util.ArrayList;
import java.util.Scanner;

public class HamiltonPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<ArrayList<Integer>> Edges = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < M; i++) {
            ArrayList<Integer> e = new ArrayList<Integer>();
            e.add(sc.nextInt());
            e.add(sc.nextInt());
            Edges.add(e);
        }
        if (check(N, M, Edges)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }

    private static boolean check(int N, int M, ArrayList<ArrayList<Integer>> Edges) {
        // your code here
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++)
            graph.add(new ArrayList<>());

        for (ArrayList<Integer> e : Edges) {
            int u = e.get(0);
            int v = e.get(1);

            // unorded graph
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[N + 1];
        ArrayList<Integer> psf = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            // trying all the nodes as source node
            boolean isHamiltonian = hamiltonian(i, visited, psf, graph, i);
            if (isHamiltonian)
                return true;
        }

        return false;
    }

    private static boolean hamiltonian(int curr, boolean[] visited, ArrayList<Integer> psf,
            ArrayList<ArrayList<Integer>> graph, int os) {

        int totalNodes = graph.size() - 1;

        if (psf.size() == totalNodes - 1) {
            psf.add(curr);
            System.out.print(psf);
            psf.remove(psf.size() - 1);

            // lets check is this node make a cycle
            // it makes cycle if it has os as one of it's neighbours

            boolean isCycle = false;
            for (int nbr : graph.get(curr)) {// why curr? because curr is the last node of the path
                if (nbr == os)
                    isCycle = true;
            }
            if (isCycle)
                System.out.println("  (Cycle)");
            else
                System.out.println();
            return true;
        }

        visited[curr] = true;
        psf.add(curr);

        for (int nbr : graph.get(curr)) {
            if (!visited[nbr]) {
                boolean isHamiltonian = hamiltonian(nbr, visited, psf, graph, os);
                if (isHamiltonian) {
                    return true;
                }
            }
        }

        visited[curr] = false;
        psf.remove(psf.size() - 1);

        return false;
    }
}
